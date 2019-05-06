/*#include <stdio.h>
#include <math.h>
#include<GL/glut.h>
GLfloat M[3][3];
//int x1=1,x2=4,x3=1;
//int y1=1,y2=1,y3=5;
float xr=2,yr=2.333;
GLfloat triangle[3][3]={{1,4,1},{1,1,5},{0,0,1}};
GLfloat fin[3][3];
float angle;
void myInit()
{
glClear(GL_COLOR_BUFFER_BIT);
glClearColor(0.0,0.0,0.0,1.0);
glMatrixMode(GL_PROJECTION);
gluOrtho2D(0,500,0,500);
}
void draw_triangle(GLfloat **a)
{
int i;
glBegin(GL_POLYGON);
for( i=0;i<=2;i++)
{
glVertex2f(a[0][i],a[1][i]);
}
glEnd();
glFlush();
}

/*void myDisplay()
{
glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT);
draw_triangle(triangle[3][0],triangle[3][1]triangle,[3][2]);
}*/
/*void rotate_triangle(GLfloat **M,GLfloat **triangle)
{
int i,j,k;
for(i=0;i<3;i++)
{
 for( j=0;j<3;j++)
 {
  fin[i][j]=0;
   for( k=0;k<3;k++)
   {
   fin[i][j]+=M[i][k]*triangle[k][j];
   }
 }
 }
}
void main(int argc,char **argv)
{

    printf("Enter the angle of rotation\n");
    scanf("%f",&angle);
    glutInit(&argc,argv);
    M[3][3] = {{cos(angle),-1*sin(angle),(xr*(1-cos(angle))+yr*sin(angle))},{sin(angle),cos(angle),(yr*(1-cos(angle))-xr*sin(angle))},{0,0,1}};

    glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
    glutInitWindowSize(500,500);
    //glutInitWindowPosition(0.0);
    glutCreateWindow("Rotate triangle");
    draw_triangle(triangle);
    //glutDisplayFunc(myDisplay);
    rotate_triangle(M,triangle);
    draw_triangle(fin);
    glutMainLoop();
}*/
#include <stdio.h>
#include<GL/glut.h>
#include<math.h>


GLfloat tri[3][3]={{100,100,175},
               {100,300,400},
               {1,1,1}};

GLfloat rot_mat[3][3]={{0},{0},{0}};
GLfloat result[3][9]={{0},{0},{0}};
GLfloat h=250.0;        //pivot points (x-axis)
GLfloat k=250.0;        //pivot points (y-axis)

float theta;

void multiply()
{
        int i, j, k;
        for(i=0;i<3;i++)
                for(j=0;j<3;j++)
                {
                        result[i][j]=0;
                        for(k=0;k<3;k++)

result[i][j]=result[i][j]+rot_mat[i][k]*tri[k][j];
                }
}

void rotate()
{
        GLfloat m, n;
        m=-h*(cos(theta)-1)+k*(sin(theta));
        n=-k*(cos(theta)-1)-h*(sin(theta));
        rot_mat[0][0] = cos(theta);
        rot_mat[0][1] = -sin(theta);
        rot_mat[0][2] = m;
        rot_mat[1][0] = sin(theta);
        rot_mat[1][1] = cos(theta);
        rot_mat[1][2] = n;
        rot_mat[2][0] = 0;
        rot_mat[2][1] = 0;
        rot_mat[2][2] = 1;
        multiply();
}

void drawhouse()
{
        int i;

        glColor3f(0,0,1);
        glBegin(GL_LINE_LOOP);
        for(i=0;i<=2;i++)
                        glVertex2f(tri[0][i],tri[1][i]);
        glEnd();
}

void drawrotatedhouse()
{
        int i;

        glColor3f(1,0,1);
        glBegin(GL_LINE_LOOP);
        for(i=0;i<=2;i++)
                        glVertex2f(result[0][i],result[1][i]);
        glEnd();
}

void display()
{
        glClear(GL_COLOR_BUFFER_BIT);
        drawhouse();
        rotate();
        drawrotatedhouse();
        glFlush();
}

void myinit()
{
        glClearColor(1,1,1,1);
        glColor3f(1,0,0);
        glPointSize(1);
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        gluOrtho2D(0,499,0,499);
}

int main(int argc, char *argv[])
{
        printf("Enter rotation angle: ");
        scanf("%f",&theta);
        theta=(theta*3.14)/180;
        glutInit(&argc, argv);
        glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
        glutInitWindowSize(500,500);
        glutInitWindowPosition(0,0);
        glutCreateWindow("Triangle rotation");
        myinit();
        glutDisplayFunc(display);
        glutMainLoop();
        return 0;
}


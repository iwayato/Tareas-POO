#include "Stage1.h"
#include "ui_Stage1.h"
#include <QGraphicsScene>

Stage1::Stage1(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::Stage1)
{
    ui->setupUi(this);

    setup();  //Se preparan las clases correspondientes

    QGraphicsView* GraphicView1 = ui->graphicsView;
    GraphicView1->setScene(lamp);  //Se agrega la lampara a la vista grafica de la ventana
}

Stage1::~Stage1()
{
    delete ui;
}

void Stage1::powerButtonClicked()
{
    control->ButtonPressed();
}

void Stage1::on_pushButton_clicked()
{
    powerButtonClicked();
}

void Stage1::setup()
{
    lamp = new Lampview();
    c = new Cloud(lamp);
    control = new LampControl(c);
}


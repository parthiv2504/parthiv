DESCRIPTION = "Simple C application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/parthiv2504/parthiv.git;branch=main"

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"


do_compile(){
    ${CC} parthiv.c  -o parthiv ${LDFLAGS}
}

do_install(){
    install -d ${D}${bindir}
    install -m 0755 parthiv ${D}${bindir}
}

def removeImage(imageReference) {
    sh "docker rmi ${imageReference}"
}
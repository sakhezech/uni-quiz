import shutil

REACT_OUT_PATH = "react-core\\build\\distributions"
ANDROID_IN_PATH = "android-shell\\app\\src\\main\\assets"


def main():
    shutil.rmtree(ANDROID_IN_PATH, ignore_errors=True)
    shutil.copytree(REACT_OUT_PATH, ANDROID_IN_PATH)


if __name__ == "__main__":
    main()

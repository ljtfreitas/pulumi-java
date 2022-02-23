// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * A file or directory to install on the device before the test starts.
 * 
 */
public final class RegularFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegularFileArgs Empty = new RegularFileArgs();

    /**
     * The source file.
     * 
     */
    @InputImport(name="content", required=true)
      private final Input<FileReferenceArgs> content;

    public Input<FileReferenceArgs> getContent() {
        return this.content;
    }

    /**
     * Where to put the content on the device. Must be an absolute, allowlisted path. If the file exists, it will be replaced. The following device-side directories and any of their subdirectories are allowlisted: ${EXTERNAL_STORAGE}, /sdcard, or /storage ${ANDROID_DATA}/local/tmp, or /data/local/tmp Specifying a path outside of these directory trees is invalid. The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device and copy the file there. It is strongly advised to use the Environment API in app and test code to access files on the device in a portable way.
     * 
     */
    @InputImport(name="devicePath", required=true)
      private final Input<String> devicePath;

    public Input<String> getDevicePath() {
        return this.devicePath;
    }

    public RegularFileArgs(
        Input<FileReferenceArgs> content,
        Input<String> devicePath) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.devicePath = Objects.requireNonNull(devicePath, "expected parameter 'devicePath' to be non-null");
    }

    private RegularFileArgs() {
        this.content = Input.empty();
        this.devicePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegularFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FileReferenceArgs> content;
        private Input<String> devicePath;

        public Builder() {
    	      // Empty
        }

        public Builder(RegularFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.devicePath = defaults.devicePath;
        }

        public Builder setContent(Input<FileReferenceArgs> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContent(FileReferenceArgs content) {
            this.content = Input.of(Objects.requireNonNull(content));
            return this;
        }

        public Builder setDevicePath(Input<String> devicePath) {
            this.devicePath = Objects.requireNonNull(devicePath);
            return this;
        }

        public Builder setDevicePath(String devicePath) {
            this.devicePath = Input.of(Objects.requireNonNull(devicePath));
            return this;
        }
        public RegularFileArgs build() {
            return new RegularFileArgs(content, devicePath);
        }
    }
}

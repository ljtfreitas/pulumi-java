// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FunctionFileSystemConfig {
    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     * 
     */
    private final String arn;
    /**
     * The path where the function can access the file system, starting with /mnt/.
     * 
     */
    private final String localMountPath;

    @OutputCustomType.Constructor({"arn","localMountPath"})
    private FunctionFileSystemConfig(
        String arn,
        String localMountPath) {
        this.arn = Objects.requireNonNull(arn);
        this.localMountPath = Objects.requireNonNull(localMountPath);
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The path where the function can access the file system, starting with /mnt/.
     * 
     */
    public String getLocalMountPath() {
        return this.localMountPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionFileSystemConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String localMountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionFileSystemConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.localMountPath = defaults.localMountPath;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setLocalMountPath(String localMountPath) {
            this.localMountPath = Objects.requireNonNull(localMountPath);
            return this;
        }
        public FunctionFileSystemConfig build() {
            return new FunctionFileSystemConfig(arn, localMountPath);
        }
    }
}

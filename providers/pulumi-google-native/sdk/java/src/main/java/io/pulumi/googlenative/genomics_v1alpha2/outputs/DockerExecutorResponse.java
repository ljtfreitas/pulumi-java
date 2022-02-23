// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DockerExecutorResponse {
    /**
     * The command or newline delimited script to run. The command string will be executed within a bash shell. If the command exits with a non-zero exit code, output parameter de-localization will be skipped and the pipeline operation's `error` field will be populated. Maximum command string length is 16384.
     * 
     */
    private final String cmd;
    /**
     * Image name from either Docker Hub or Google Container Registry. Users that run pipelines must have READ access to the image.
     * 
     */
    private final String imageName;

    @OutputCustomType.Constructor({"cmd","imageName"})
    private DockerExecutorResponse(
        String cmd,
        String imageName) {
        this.cmd = Objects.requireNonNull(cmd);
        this.imageName = Objects.requireNonNull(imageName);
    }

    /**
     * The command or newline delimited script to run. The command string will be executed within a bash shell. If the command exits with a non-zero exit code, output parameter de-localization will be skipped and the pipeline operation's `error` field will be populated. Maximum command string length is 16384.
     * 
     */
    public String getCmd() {
        return this.cmd;
    }
    /**
     * Image name from either Docker Hub or Google Container Registry. Users that run pipelines must have READ access to the image.
     * 
     */
    public String getImageName() {
        return this.imageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerExecutorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cmd;
        private String imageName;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerExecutorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmd = defaults.cmd;
    	      this.imageName = defaults.imageName;
        }

        public Builder setCmd(String cmd) {
            this.cmd = Objects.requireNonNull(cmd);
            return this;
        }

        public Builder setImageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        public DockerExecutorResponse build() {
            return new DockerExecutorResponse(cmd, imageName);
        }
    }
}

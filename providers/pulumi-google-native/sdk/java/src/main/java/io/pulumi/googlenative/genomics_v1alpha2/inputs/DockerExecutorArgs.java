// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Docker execuctor specification.
 * 
 */
public final class DockerExecutorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DockerExecutorArgs Empty = new DockerExecutorArgs();

    /**
     * The command or newline delimited script to run. The command string will be executed within a bash shell. If the command exits with a non-zero exit code, output parameter de-localization will be skipped and the pipeline operation's `error` field will be populated. Maximum command string length is 16384.
     * 
     */
    @Import(name="cmd", required=true)
      private final Output<String> cmd;

    public Output<String> getCmd() {
        return this.cmd;
    }

    /**
     * Image name from either Docker Hub or Google Container Registry. Users that run pipelines must have READ access to the image.
     * 
     */
    @Import(name="imageName", required=true)
      private final Output<String> imageName;

    public Output<String> getImageName() {
        return this.imageName;
    }

    public DockerExecutorArgs(
        Output<String> cmd,
        Output<String> imageName) {
        this.cmd = Objects.requireNonNull(cmd, "expected parameter 'cmd' to be non-null");
        this.imageName = Objects.requireNonNull(imageName, "expected parameter 'imageName' to be non-null");
    }

    private DockerExecutorArgs() {
        this.cmd = Output.empty();
        this.imageName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerExecutorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cmd;
        private Output<String> imageName;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerExecutorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmd = defaults.cmd;
    	      this.imageName = defaults.imageName;
        }

        public Builder cmd(Output<String> cmd) {
            this.cmd = Objects.requireNonNull(cmd);
            return this;
        }

        public Builder cmd(String cmd) {
            this.cmd = Output.of(Objects.requireNonNull(cmd));
            return this;
        }

        public Builder imageName(Output<String> imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }

        public Builder imageName(String imageName) {
            this.imageName = Output.of(Objects.requireNonNull(imageName));
            return this;
        }
        public DockerExecutorArgs build() {
            return new DockerExecutorArgs(cmd, imageName);
        }
    }
}

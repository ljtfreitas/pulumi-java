// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies an executable to run on a fully configured node and a timeout period for executable completion.
 * 
 */
public final class NodeInitializationActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeInitializationActionArgs Empty = new NodeInitializationActionArgs();

    /**
     * Cloud Storage URI of executable file.
     * 
     */
    @InputImport(name="executableFile", required=true)
      private final Input<String> executableFile;

    public Input<String> getExecutableFile() {
        return this.executableFile;
    }

    /**
     * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
     * 
     */
    @InputImport(name="executionTimeout")
      private final @Nullable Input<String> executionTimeout;

    public Input<String> getExecutionTimeout() {
        return this.executionTimeout == null ? Input.empty() : this.executionTimeout;
    }

    public NodeInitializationActionArgs(
        Input<String> executableFile,
        @Nullable Input<String> executionTimeout) {
        this.executableFile = Objects.requireNonNull(executableFile, "expected parameter 'executableFile' to be non-null");
        this.executionTimeout = executionTimeout;
    }

    private NodeInitializationActionArgs() {
        this.executableFile = Input.empty();
        this.executionTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInitializationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> executableFile;
        private @Nullable Input<String> executionTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInitializationActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableFile = defaults.executableFile;
    	      this.executionTimeout = defaults.executionTimeout;
        }

        public Builder setExecutableFile(Input<String> executableFile) {
            this.executableFile = Objects.requireNonNull(executableFile);
            return this;
        }

        public Builder setExecutableFile(String executableFile) {
            this.executableFile = Input.of(Objects.requireNonNull(executableFile));
            return this;
        }

        public Builder setExecutionTimeout(@Nullable Input<String> executionTimeout) {
            this.executionTimeout = executionTimeout;
            return this;
        }

        public Builder setExecutionTimeout(@Nullable String executionTimeout) {
            this.executionTimeout = Input.ofNullable(executionTimeout);
            return this;
        }
        public NodeInitializationActionArgs build() {
            return new NodeInitializationActionArgs(executableFile, executionTimeout);
        }
    }
}

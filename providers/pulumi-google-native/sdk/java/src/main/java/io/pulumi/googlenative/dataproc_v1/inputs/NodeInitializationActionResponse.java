// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies an executable to run on a fully configured node and a timeout period for executable completion.
 * 
 */
public final class NodeInitializationActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeInitializationActionResponse Empty = new NodeInitializationActionResponse();

    /**
     * Cloud Storage URI of executable file.
     * 
     */
    @Import(name="executableFile", required=true)
      private final String executableFile;

    public String getExecutableFile() {
        return this.executableFile;
    }

    /**
     * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
     * 
     */
    @Import(name="executionTimeout", required=true)
      private final String executionTimeout;

    public String getExecutionTimeout() {
        return this.executionTimeout;
    }

    public NodeInitializationActionResponse(
        String executableFile,
        String executionTimeout) {
        this.executableFile = Objects.requireNonNull(executableFile, "expected parameter 'executableFile' to be non-null");
        this.executionTimeout = Objects.requireNonNull(executionTimeout, "expected parameter 'executionTimeout' to be non-null");
    }

    private NodeInitializationActionResponse() {
        this.executableFile = null;
        this.executionTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInitializationActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executableFile;
        private String executionTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInitializationActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableFile = defaults.executableFile;
    	      this.executionTimeout = defaults.executionTimeout;
        }

        public Builder executableFile(String executableFile) {
            this.executableFile = Objects.requireNonNull(executableFile);
            return this;
        }

        public Builder executionTimeout(String executionTimeout) {
            this.executionTimeout = Objects.requireNonNull(executionTimeout);
            return this;
        }
        public NodeInitializationActionResponse build() {
            return new NodeInitializationActionResponse(executableFile, executionTimeout);
        }
    }
}

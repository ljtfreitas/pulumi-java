// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.enums.CompletionOperationTypes;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The complete operation.
 * 
 */
public final class ConnectorMappingCompleteOperationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingCompleteOperationArgs Empty = new ConnectorMappingCompleteOperationArgs();

    /**
     * The type of completion operation.
     * 
     */
    @Import(name="completionOperationType")
      private final @Nullable Output<CompletionOperationTypes> completionOperationType;

    public Output<CompletionOperationTypes> getCompletionOperationType() {
        return this.completionOperationType == null ? Output.empty() : this.completionOperationType;
    }

    /**
     * The destination folder where files will be moved to once the import is done.
     * 
     */
    @Import(name="destinationFolder")
      private final @Nullable Output<String> destinationFolder;

    public Output<String> getDestinationFolder() {
        return this.destinationFolder == null ? Output.empty() : this.destinationFolder;
    }

    public ConnectorMappingCompleteOperationArgs(
        @Nullable Output<CompletionOperationTypes> completionOperationType,
        @Nullable Output<String> destinationFolder) {
        this.completionOperationType = completionOperationType;
        this.destinationFolder = destinationFolder;
    }

    private ConnectorMappingCompleteOperationArgs() {
        this.completionOperationType = Output.empty();
        this.destinationFolder = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingCompleteOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CompletionOperationTypes> completionOperationType;
        private @Nullable Output<String> destinationFolder;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingCompleteOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionOperationType = defaults.completionOperationType;
    	      this.destinationFolder = defaults.destinationFolder;
        }

        public Builder completionOperationType(@Nullable Output<CompletionOperationTypes> completionOperationType) {
            this.completionOperationType = completionOperationType;
            return this;
        }

        public Builder completionOperationType(@Nullable CompletionOperationTypes completionOperationType) {
            this.completionOperationType = Output.ofNullable(completionOperationType);
            return this;
        }

        public Builder destinationFolder(@Nullable Output<String> destinationFolder) {
            this.destinationFolder = destinationFolder;
            return this;
        }

        public Builder destinationFolder(@Nullable String destinationFolder) {
            this.destinationFolder = Output.ofNullable(destinationFolder);
            return this;
        }
        public ConnectorMappingCompleteOperationArgs build() {
            return new ConnectorMappingCompleteOperationArgs(completionOperationType, destinationFolder);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigPubsubDestinationGetArgs;
import java.util.Objects;


public final class FolderFeedFeedOutputConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderFeedFeedOutputConfigGetArgs Empty = new FolderFeedFeedOutputConfigGetArgs();

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    @Import(name="pubsubDestination", required=true)
      private final Output<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination;

    public Output<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> getPubsubDestination() {
        return this.pubsubDestination;
    }

    public FolderFeedFeedOutputConfigGetArgs(Output<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination) {
        this.pubsubDestination = Objects.requireNonNull(pubsubDestination, "expected parameter 'pubsubDestination' to be non-null");
    }

    private FolderFeedFeedOutputConfigGetArgs() {
        this.pubsubDestination = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderFeedFeedOutputConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderFeedFeedOutputConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder pubsubDestination(Output<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }

        public Builder pubsubDestination(FolderFeedFeedOutputConfigPubsubDestinationGetArgs pubsubDestination) {
            this.pubsubDestination = Output.of(Objects.requireNonNull(pubsubDestination));
            return this;
        }
        public FolderFeedFeedOutputConfigGetArgs build() {
            return new FolderFeedFeedOutputConfigGetArgs(pubsubDestination);
        }
    }
}

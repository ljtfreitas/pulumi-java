// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventStreamState extends io.pulumi.resources.ResourceArgs {

    public static final EventStreamState Empty = new EventStreamState();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId")
      private final @Nullable Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId == null ? Output.empty() : this.applicationId;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
     * 
     */
    @Import(name="destinationStreamArn")
      private final @Nullable Output<String> destinationStreamArn;

    public Output<String> getDestinationStreamArn() {
        return this.destinationStreamArn == null ? Output.empty() : this.destinationStreamArn;
    }

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    public EventStreamState(
        @Nullable Output<String> applicationId,
        @Nullable Output<String> destinationStreamArn,
        @Nullable Output<String> roleArn) {
        this.applicationId = applicationId;
        this.destinationStreamArn = destinationStreamArn;
        this.roleArn = roleArn;
    }

    private EventStreamState() {
        this.applicationId = Output.empty();
        this.destinationStreamArn = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationId;
        private @Nullable Output<String> destinationStreamArn;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventStreamState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.destinationStreamArn = defaults.destinationStreamArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Output.ofNullable(applicationId);
            return this;
        }

        public Builder destinationStreamArn(@Nullable Output<String> destinationStreamArn) {
            this.destinationStreamArn = destinationStreamArn;
            return this;
        }

        public Builder destinationStreamArn(@Nullable String destinationStreamArn) {
            this.destinationStreamArn = Output.ofNullable(destinationStreamArn);
            return this;
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }
        public EventStreamState build() {
            return new EventStreamState(applicationId, destinationStreamArn, roleArn);
        }
    }
}

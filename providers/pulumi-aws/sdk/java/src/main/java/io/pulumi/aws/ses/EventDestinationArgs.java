// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs;
import io.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs;
import io.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventDestinationArgs Empty = new EventDestinationArgs();

    /**
     * CloudWatch destination for the events
     * 
     */
    @Import(name="cloudwatchDestinations")
      private final @Nullable Output<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations;

    public Output<List<EventDestinationCloudwatchDestinationArgs>> getCloudwatchDestinations() {
        return this.cloudwatchDestinations == null ? Output.empty() : this.cloudwatchDestinations;
    }

    /**
     * The name of the configuration set
     * 
     */
    @Import(name="configurationSetName", required=true)
      private final Output<String> configurationSetName;

    public Output<String> getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * If true, the event destination will be enabled
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Send the events to a kinesis firehose destination
     * 
     */
    @Import(name="kinesisDestination")
      private final @Nullable Output<EventDestinationKinesisDestinationArgs> kinesisDestination;

    public Output<EventDestinationKinesisDestinationArgs> getKinesisDestination() {
        return this.kinesisDestination == null ? Output.empty() : this.kinesisDestination;
    }

    /**
     * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
     * 
     */
    @Import(name="matchingTypes", required=true)
      private final Output<List<String>> matchingTypes;

    public Output<List<String>> getMatchingTypes() {
        return this.matchingTypes;
    }

    /**
     * The name of the event destination
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Send the events to an SNS Topic destination
     * 
     */
    @Import(name="snsDestination")
      private final @Nullable Output<EventDestinationSnsDestinationArgs> snsDestination;

    public Output<EventDestinationSnsDestinationArgs> getSnsDestination() {
        return this.snsDestination == null ? Output.empty() : this.snsDestination;
    }

    public EventDestinationArgs(
        @Nullable Output<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations,
        Output<String> configurationSetName,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<EventDestinationKinesisDestinationArgs> kinesisDestination,
        Output<List<String>> matchingTypes,
        @Nullable Output<String> name,
        @Nullable Output<EventDestinationSnsDestinationArgs> snsDestination) {
        this.cloudwatchDestinations = cloudwatchDestinations;
        this.configurationSetName = Objects.requireNonNull(configurationSetName, "expected parameter 'configurationSetName' to be non-null");
        this.enabled = enabled;
        this.kinesisDestination = kinesisDestination;
        this.matchingTypes = Objects.requireNonNull(matchingTypes, "expected parameter 'matchingTypes' to be non-null");
        this.name = name;
        this.snsDestination = snsDestination;
    }

    private EventDestinationArgs() {
        this.cloudwatchDestinations = Output.empty();
        this.configurationSetName = Output.empty();
        this.enabled = Output.empty();
        this.kinesisDestination = Output.empty();
        this.matchingTypes = Output.empty();
        this.name = Output.empty();
        this.snsDestination = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations;
        private Output<String> configurationSetName;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<EventDestinationKinesisDestinationArgs> kinesisDestination;
        private Output<List<String>> matchingTypes;
        private @Nullable Output<String> name;
        private @Nullable Output<EventDestinationSnsDestinationArgs> snsDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(EventDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchDestinations = defaults.cloudwatchDestinations;
    	      this.configurationSetName = defaults.configurationSetName;
    	      this.enabled = defaults.enabled;
    	      this.kinesisDestination = defaults.kinesisDestination;
    	      this.matchingTypes = defaults.matchingTypes;
    	      this.name = defaults.name;
    	      this.snsDestination = defaults.snsDestination;
        }

        public Builder cloudwatchDestinations(@Nullable Output<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations) {
            this.cloudwatchDestinations = cloudwatchDestinations;
            return this;
        }

        public Builder cloudwatchDestinations(@Nullable List<EventDestinationCloudwatchDestinationArgs> cloudwatchDestinations) {
            this.cloudwatchDestinations = Output.ofNullable(cloudwatchDestinations);
            return this;
        }

        public Builder configurationSetName(Output<String> configurationSetName) {
            this.configurationSetName = Objects.requireNonNull(configurationSetName);
            return this;
        }

        public Builder configurationSetName(String configurationSetName) {
            this.configurationSetName = Output.of(Objects.requireNonNull(configurationSetName));
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder kinesisDestination(@Nullable Output<EventDestinationKinesisDestinationArgs> kinesisDestination) {
            this.kinesisDestination = kinesisDestination;
            return this;
        }

        public Builder kinesisDestination(@Nullable EventDestinationKinesisDestinationArgs kinesisDestination) {
            this.kinesisDestination = Output.ofNullable(kinesisDestination);
            return this;
        }

        public Builder matchingTypes(Output<List<String>> matchingTypes) {
            this.matchingTypes = Objects.requireNonNull(matchingTypes);
            return this;
        }

        public Builder matchingTypes(List<String> matchingTypes) {
            this.matchingTypes = Output.of(Objects.requireNonNull(matchingTypes));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder snsDestination(@Nullable Output<EventDestinationSnsDestinationArgs> snsDestination) {
            this.snsDestination = snsDestination;
            return this;
        }

        public Builder snsDestination(@Nullable EventDestinationSnsDestinationArgs snsDestination) {
            this.snsDestination = Output.ofNullable(snsDestination);
            return this;
        }
        public EventDestinationArgs build() {
            return new EventDestinationArgs(cloudwatchDestinations, configurationSetName, enabled, kinesisDestination, matchingTypes, name, snsDestination);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs;
import io.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs;
import io.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="cloudwatchDestinations")
    private final @Nullable Input<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations;

    public Input<List<EventDestinationCloudwatchDestinationArgs>> getCloudwatchDestinations() {
        return this.cloudwatchDestinations == null ? Input.empty() : this.cloudwatchDestinations;
    }

    /**
     * The name of the configuration set
     * 
     */
    @InputImport(name="configurationSetName", required=true)
    private final Input<String> configurationSetName;

    public Input<String> getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * If true, the event destination will be enabled
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Send the events to a kinesis firehose destination
     * 
     */
    @InputImport(name="kinesisDestination")
    private final @Nullable Input<EventDestinationKinesisDestinationArgs> kinesisDestination;

    public Input<EventDestinationKinesisDestinationArgs> getKinesisDestination() {
        return this.kinesisDestination == null ? Input.empty() : this.kinesisDestination;
    }

    /**
     * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
     * 
     */
    @InputImport(name="matchingTypes", required=true)
    private final Input<List<String>> matchingTypes;

    public Input<List<String>> getMatchingTypes() {
        return this.matchingTypes;
    }

    /**
     * The name of the event destination
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Send the events to an SNS Topic destination
     * 
     */
    @InputImport(name="snsDestination")
    private final @Nullable Input<EventDestinationSnsDestinationArgs> snsDestination;

    public Input<EventDestinationSnsDestinationArgs> getSnsDestination() {
        return this.snsDestination == null ? Input.empty() : this.snsDestination;
    }

    public EventDestinationArgs(
        @Nullable Input<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations,
        Input<String> configurationSetName,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<EventDestinationKinesisDestinationArgs> kinesisDestination,
        Input<List<String>> matchingTypes,
        @Nullable Input<String> name,
        @Nullable Input<EventDestinationSnsDestinationArgs> snsDestination) {
        this.cloudwatchDestinations = cloudwatchDestinations;
        this.configurationSetName = Objects.requireNonNull(configurationSetName, "expected parameter 'configurationSetName' to be non-null");
        this.enabled = enabled;
        this.kinesisDestination = kinesisDestination;
        this.matchingTypes = Objects.requireNonNull(matchingTypes, "expected parameter 'matchingTypes' to be non-null");
        this.name = name;
        this.snsDestination = snsDestination;
    }

    private EventDestinationArgs() {
        this.cloudwatchDestinations = Input.empty();
        this.configurationSetName = Input.empty();
        this.enabled = Input.empty();
        this.kinesisDestination = Input.empty();
        this.matchingTypes = Input.empty();
        this.name = Input.empty();
        this.snsDestination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations;
        private Input<String> configurationSetName;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<EventDestinationKinesisDestinationArgs> kinesisDestination;
        private Input<List<String>> matchingTypes;
        private @Nullable Input<String> name;
        private @Nullable Input<EventDestinationSnsDestinationArgs> snsDestination;

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

        public Builder setCloudwatchDestinations(@Nullable Input<List<EventDestinationCloudwatchDestinationArgs>> cloudwatchDestinations) {
            this.cloudwatchDestinations = cloudwatchDestinations;
            return this;
        }

        public Builder setCloudwatchDestinations(@Nullable List<EventDestinationCloudwatchDestinationArgs> cloudwatchDestinations) {
            this.cloudwatchDestinations = Input.ofNullable(cloudwatchDestinations);
            return this;
        }

        public Builder setConfigurationSetName(Input<String> configurationSetName) {
            this.configurationSetName = Objects.requireNonNull(configurationSetName);
            return this;
        }

        public Builder setConfigurationSetName(String configurationSetName) {
            this.configurationSetName = Input.of(Objects.requireNonNull(configurationSetName));
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setKinesisDestination(@Nullable Input<EventDestinationKinesisDestinationArgs> kinesisDestination) {
            this.kinesisDestination = kinesisDestination;
            return this;
        }

        public Builder setKinesisDestination(@Nullable EventDestinationKinesisDestinationArgs kinesisDestination) {
            this.kinesisDestination = Input.ofNullable(kinesisDestination);
            return this;
        }

        public Builder setMatchingTypes(Input<List<String>> matchingTypes) {
            this.matchingTypes = Objects.requireNonNull(matchingTypes);
            return this;
        }

        public Builder setMatchingTypes(List<String> matchingTypes) {
            this.matchingTypes = Input.of(Objects.requireNonNull(matchingTypes));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSnsDestination(@Nullable Input<EventDestinationSnsDestinationArgs> snsDestination) {
            this.snsDestination = snsDestination;
            return this;
        }

        public Builder setSnsDestination(@Nullable EventDestinationSnsDestinationArgs snsDestination) {
            this.snsDestination = Input.ofNullable(snsDestination);
            return this;
        }
        public EventDestinationArgs build() {
            return new EventDestinationArgs(cloudwatchDestinations, configurationSetName, enabled, kinesisDestination, matchingTypes, name, snsDestination);
        }
    }
}
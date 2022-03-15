// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.policysimulator_v1.outputs.GoogleCloudPolicysimulatorV1ReplayConfigResponse;
import io.pulumi.googlenative.policysimulator_v1.outputs.GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOrganizationReplayResult {
    /**
     * The configuration used for the `Replay`.
     * 
     */
    private final GoogleCloudPolicysimulatorV1ReplayConfigResponse config;
    /**
     * The resource name of the `Replay`, which has the following format: `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`, where `{resource-id}` is the ID of the project, folder, or organization that owns the Replay. Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
     * 
     */
    private final String name;
    /**
     * Summary statistics about the replayed log entries.
     * 
     */
    private final GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse resultsSummary;
    /**
     * The current state of the `Replay`.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetOrganizationReplayResult(
        @CustomType.Parameter("config") GoogleCloudPolicysimulatorV1ReplayConfigResponse config,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resultsSummary") GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse resultsSummary,
        @CustomType.Parameter("state") String state) {
        this.config = config;
        this.name = name;
        this.resultsSummary = resultsSummary;
        this.state = state;
    }

    /**
     * The configuration used for the `Replay`.
     * 
    */
    public GoogleCloudPolicysimulatorV1ReplayConfigResponse getConfig() {
        return this.config;
    }
    /**
     * The resource name of the `Replay`, which has the following format: `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`, where `{resource-id}` is the ID of the project, folder, or organization that owns the Replay. Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Summary statistics about the replayed log entries.
     * 
    */
    public GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse getResultsSummary() {
        return this.resultsSummary;
    }
    /**
     * The current state of the `Replay`.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationReplayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudPolicysimulatorV1ReplayConfigResponse config;
        private String name;
        private GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse resultsSummary;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationReplayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.name = defaults.name;
    	      this.resultsSummary = defaults.resultsSummary;
    	      this.state = defaults.state;
        }

        public Builder config(GoogleCloudPolicysimulatorV1ReplayConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resultsSummary(GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse resultsSummary) {
            this.resultsSummary = Objects.requireNonNull(resultsSummary);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetOrganizationReplayResult build() {
            return new GetOrganizationReplayResult(config, name, resultsSummary, state);
        }
    }
}

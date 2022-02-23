// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.outputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceResult {
    /**
     * The policy to define whether or not RBE features can be used or how they can be used.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse featurePolicy;
    /**
     * The location is a GCP region. Currently only `us-central1` is supported.
     * 
     */
    private final String location;
    /**
     * Whether stack driver logging is enabled for the instance.
     * 
     */
    private final Boolean loggingEnabled;
    /**
     * Instance resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an instance since it is provided in the `instance_id` field.
     * 
     */
    private final String name;
    /**
     * State of the instance.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"featurePolicy","location","loggingEnabled","name","state"})
    private GetInstanceResult(
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse featurePolicy,
        String location,
        Boolean loggingEnabled,
        String name,
        String state) {
        this.featurePolicy = Objects.requireNonNull(featurePolicy);
        this.location = Objects.requireNonNull(location);
        this.loggingEnabled = Objects.requireNonNull(loggingEnabled);
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The policy to define whether or not RBE features can be used or how they can be used.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse getFeaturePolicy() {
        return this.featurePolicy;
    }
    /**
     * The location is a GCP region. Currently only `us-central1` is supported.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Whether stack driver logging is enabled for the instance.
     * 
     */
    public Boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }
    /**
     * Instance resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an instance since it is provided in the `instance_id` field.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * State of the instance.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse featurePolicy;
        private String location;
        private Boolean loggingEnabled;
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featurePolicy = defaults.featurePolicy;
    	      this.location = defaults.location;
    	      this.loggingEnabled = defaults.loggingEnabled;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder setFeaturePolicy(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse featurePolicy) {
            this.featurePolicy = Objects.requireNonNull(featurePolicy);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLoggingEnabled(Boolean loggingEnabled) {
            this.loggingEnabled = Objects.requireNonNull(loggingEnabled);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetInstanceResult build() {
            return new GetInstanceResult(featurePolicy, location, loggingEnabled, name, state);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.gkehub_v1.outputs.CommonFeatureSpecResponse;
import io.pulumi.googlenative.gkehub_v1.outputs.CommonFeatureStateResponse;
import io.pulumi.googlenative.gkehub_v1.outputs.FeatureResourceStateResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFeatureResult {
    /**
     * When the Feature resource was created.
     * 
     */
    private final String createTime;
    /**
     * When the Feature resource was deleted.
     * 
     */
    private final String deleteTime;
    /**
     * GCP labels for this Feature.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature's project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
     * 
     */
    private final Map<String,String> membershipSpecs;
    /**
     * Membership-specific Feature status. If this Feature does report any per-Membership status, this field may be unused. The keys indicate which Membership the state is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project number, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} MUST match the Feature's project number.
     * 
     */
    private final Map<String,String> membershipStates;
    /**
     * The full, unique name of this Feature resource in the format `projects/*{@literal /}locations/*{@literal /}features/*`.
     * 
     */
    private final String name;
    /**
     * State of the Feature resource itself.
     * 
     */
    private final FeatureResourceStateResponse resourceState;
    /**
     * Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
     */
    private final CommonFeatureSpecResponse spec;
    /**
     * The Hub-wide Feature state.
     * 
     */
    private final CommonFeatureStateResponse state;
    /**
     * When the Feature resource was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetFeatureResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deleteTime") String deleteTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("membershipSpecs") Map<String,String> membershipSpecs,
        @CustomType.Parameter("membershipStates") Map<String,String> membershipStates,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceState") FeatureResourceStateResponse resourceState,
        @CustomType.Parameter("spec") CommonFeatureSpecResponse spec,
        @CustomType.Parameter("state") CommonFeatureStateResponse state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.labels = labels;
        this.membershipSpecs = membershipSpecs;
        this.membershipStates = membershipStates;
        this.name = name;
        this.resourceState = resourceState;
        this.spec = spec;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * When the Feature resource was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * When the Feature resource was deleted.
     * 
    */
    public String getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * GCP labels for this Feature.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature's project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
     * 
    */
    public Map<String,String> getMembershipSpecs() {
        return this.membershipSpecs;
    }
    /**
     * Membership-specific Feature status. If this Feature does report any per-Membership status, this field may be unused. The keys indicate which Membership the state is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project number, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} MUST match the Feature's project number.
     * 
    */
    public Map<String,String> getMembershipStates() {
        return this.membershipStates;
    }
    /**
     * The full, unique name of this Feature resource in the format `projects/*{@literal /}locations/*{@literal /}features/*`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of the Feature resource itself.
     * 
    */
    public FeatureResourceStateResponse getResourceState() {
        return this.resourceState;
    }
    /**
     * Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
    */
    public CommonFeatureSpecResponse getSpec() {
        return this.spec;
    }
    /**
     * The Hub-wide Feature state.
     * 
    */
    public CommonFeatureStateResponse getState() {
        return this.state;
    }
    /**
     * When the Feature resource was last updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String deleteTime;
        private Map<String,String> labels;
        private Map<String,String> membershipSpecs;
        private Map<String,String> membershipStates;
        private String name;
        private FeatureResourceStateResponse resourceState;
        private CommonFeatureSpecResponse spec;
        private CommonFeatureStateResponse state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFeatureResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.labels = defaults.labels;
    	      this.membershipSpecs = defaults.membershipSpecs;
    	      this.membershipStates = defaults.membershipStates;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.spec = defaults.spec;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder membershipSpecs(Map<String,String> membershipSpecs) {
            this.membershipSpecs = Objects.requireNonNull(membershipSpecs);
            return this;
        }

        public Builder membershipStates(Map<String,String> membershipStates) {
            this.membershipStates = Objects.requireNonNull(membershipStates);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceState(FeatureResourceStateResponse resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder spec(CommonFeatureSpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public Builder state(CommonFeatureStateResponse state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetFeatureResult build() {
            return new GetFeatureResult(createTime, deleteTime, labels, membershipSpecs, membershipStates, name, resourceState, spec, state, updateTime);
        }
    }
}

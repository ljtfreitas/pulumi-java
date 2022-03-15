// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.azurenative.alertsmanagement.outputs.ActionGroupsInformationResponse;
import io.pulumi.azurenative.alertsmanagement.outputs.DetectorResponse;
import io.pulumi.azurenative.alertsmanagement.outputs.ThrottlingInformationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSmartDetectorAlertRuleResult {
    /**
     * The alert rule actions.
     * 
     */
    private final ActionGroupsInformationResponse actionGroups;
    /**
     * The alert rule description.
     * 
     */
    private final @Nullable String description;
    /**
     * The alert rule's detector.
     * 
     */
    private final DetectorResponse detector;
    /**
     * The alert rule frequency in ISO8601 format. The time granularity must be in minutes and minimum value is 5 minutes.
     * 
     */
    private final String frequency;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The alert rule resources scope.
     * 
     */
    private final List<String> scope;
    /**
     * The alert rule severity.
     * 
     */
    private final String severity;
    /**
     * The alert rule state.
     * 
     */
    private final String state;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The alert rule throttling information.
     * 
     */
    private final @Nullable ThrottlingInformationResponse throttling;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSmartDetectorAlertRuleResult(
        @CustomType.Parameter("actionGroups") ActionGroupsInformationResponse actionGroups,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("detector") DetectorResponse detector,
        @CustomType.Parameter("frequency") String frequency,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("scope") List<String> scope,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("throttling") @Nullable ThrottlingInformationResponse throttling,
        @CustomType.Parameter("type") String type) {
        this.actionGroups = actionGroups;
        this.description = description;
        this.detector = detector;
        this.frequency = frequency;
        this.id = id;
        this.location = location;
        this.name = name;
        this.scope = scope;
        this.severity = severity;
        this.state = state;
        this.tags = tags;
        this.throttling = throttling;
        this.type = type;
    }

    /**
     * The alert rule actions.
     * 
    */
    public ActionGroupsInformationResponse getActionGroups() {
        return this.actionGroups;
    }
    /**
     * The alert rule description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The alert rule's detector.
     * 
    */
    public DetectorResponse getDetector() {
        return this.detector;
    }
    /**
     * The alert rule frequency in ISO8601 format. The time granularity must be in minutes and minimum value is 5 minutes.
     * 
    */
    public String getFrequency() {
        return this.frequency;
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The alert rule resources scope.
     * 
    */
    public List<String> getScope() {
        return this.scope;
    }
    /**
     * The alert rule severity.
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    /**
     * The alert rule state.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The alert rule throttling information.
     * 
    */
    public Optional<ThrottlingInformationResponse> getThrottling() {
        return Optional.ofNullable(this.throttling);
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmartDetectorAlertRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionGroupsInformationResponse actionGroups;
        private @Nullable String description;
        private DetectorResponse detector;
        private String frequency;
        private String id;
        private @Nullable String location;
        private String name;
        private List<String> scope;
        private String severity;
        private String state;
        private @Nullable Map<String,String> tags;
        private @Nullable ThrottlingInformationResponse throttling;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSmartDetectorAlertRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroups = defaults.actionGroups;
    	      this.description = defaults.description;
    	      this.detector = defaults.detector;
    	      this.frequency = defaults.frequency;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.severity = defaults.severity;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.throttling = defaults.throttling;
    	      this.type = defaults.type;
        }

        public Builder actionGroups(ActionGroupsInformationResponse actionGroups) {
            this.actionGroups = Objects.requireNonNull(actionGroups);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder detector(DetectorResponse detector) {
            this.detector = Objects.requireNonNull(detector);
            return this;
        }

        public Builder frequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder scope(List<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder throttling(@Nullable ThrottlingInformationResponse throttling) {
            this.throttling = throttling;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSmartDetectorAlertRuleResult build() {
            return new GetSmartDetectorAlertRuleResult(actionGroups, description, detector, frequency, id, location, name, scope, severity, state, tags, throttling, type);
        }
    }
}

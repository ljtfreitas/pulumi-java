// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.MetricAlertActionResponse;
import io.pulumi.azurenative.insights.outputs.MetricAlertMultipleResourceMultipleMetricCriteriaResponse;
import io.pulumi.azurenative.insights.outputs.MetricAlertSingleResourceMultipleMetricCriteriaResponse;
import io.pulumi.azurenative.insights.outputs.WebtestLocationAvailabilityCriteriaResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMetricAlertResult {
    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    private final @Nullable List<MetricAlertActionResponse> actions;
    /**
     * the flag that indicates whether the alert should be auto resolved or not. The default is true.
     * 
     */
    private final @Nullable Boolean autoMitigate;
    /**
     * defines the specific alert criteria information.
     * 
     */
    private final Object criteria;
    /**
     * the description of the metric alert that will be included in the alert email.
     * 
     */
    private final @Nullable String description;
    /**
     * the flag that indicates whether the metric alert is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * how often the metric alert is evaluated represented in ISO 8601 duration format.
     * 
     */
    private final String evaluationFrequency;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * the value indicating whether this alert rule is migrated.
     * 
     */
    private final Boolean isMigrated;
    /**
     * Last time the rule was updated in ISO8601 format.
     * 
     */
    private final String lastUpdatedTime;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * the list of resource id's that this metric alert is scoped to.
     * 
     */
    private final List<String> scopes;
    /**
     * Alert severity {0, 1, 2, 3, 4}
     * 
     */
    private final Integer severity;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * the region of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    private final @Nullable String targetResourceRegion;
    /**
     * the resource type of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    private final @Nullable String targetResourceType;
    /**
     * Azure resource type
     * 
     */
    private final String type;
    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold.
     * 
     */
    private final String windowSize;

    @OutputCustomType.Constructor({"actions","autoMitigate","criteria","description","enabled","evaluationFrequency","id","isMigrated","lastUpdatedTime","location","name","scopes","severity","tags","targetResourceRegion","targetResourceType","type","windowSize"})
    private GetMetricAlertResult(
        @Nullable List<MetricAlertActionResponse> actions,
        @Nullable Boolean autoMitigate,
        Object criteria,
        @Nullable String description,
        Boolean enabled,
        String evaluationFrequency,
        String id,
        Boolean isMigrated,
        String lastUpdatedTime,
        String location,
        String name,
        List<String> scopes,
        Integer severity,
        @Nullable Map<String,String> tags,
        @Nullable String targetResourceRegion,
        @Nullable String targetResourceType,
        String type,
        String windowSize) {
        this.actions = actions;
        this.autoMitigate = autoMitigate;
        this.criteria = Objects.requireNonNull(criteria);
        this.description = description;
        this.enabled = Objects.requireNonNull(enabled);
        this.evaluationFrequency = Objects.requireNonNull(evaluationFrequency);
        this.id = Objects.requireNonNull(id);
        this.isMigrated = Objects.requireNonNull(isMigrated);
        this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.scopes = Objects.requireNonNull(scopes);
        this.severity = Objects.requireNonNull(severity);
        this.tags = tags;
        this.targetResourceRegion = targetResourceRegion;
        this.targetResourceType = targetResourceType;
        this.type = Objects.requireNonNull(type);
        this.windowSize = Objects.requireNonNull(windowSize);
    }

    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    public List<MetricAlertActionResponse> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * the flag that indicates whether the alert should be auto resolved or not. The default is true.
     * 
     */
    public Optional<Boolean> getAutoMitigate() {
        return Optional.ofNullable(this.autoMitigate);
    }
    /**
     * defines the specific alert criteria information.
     * 
     */
    public Object getCriteria() {
        return this.criteria;
    }
    /**
     * the description of the metric alert that will be included in the alert email.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * the flag that indicates whether the metric alert is enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * how often the metric alert is evaluated represented in ISO 8601 duration format.
     * 
     */
    public String getEvaluationFrequency() {
        return this.evaluationFrequency;
    }
    /**
     * Azure resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * the value indicating whether this alert rule is migrated.
     * 
     */
    public Boolean getIsMigrated() {
        return this.isMigrated;
    }
    /**
     * Last time the rule was updated in ISO8601 format.
     * 
     */
    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * Resource location
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * the list of resource id's that this metric alert is scoped to.
     * 
     */
    public List<String> getScopes() {
        return this.scopes;
    }
    /**
     * Alert severity {0, 1, 2, 3, 4}
     * 
     */
    public Integer getSeverity() {
        return this.severity;
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * the region of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    public Optional<String> getTargetResourceRegion() {
        return Optional.ofNullable(this.targetResourceRegion);
    }
    /**
     * the resource type of the target resource(s) on which the alert is created/updated. Mandatory if the scope contains a subscription, resource group, or more than one resource.
     * 
     */
    public Optional<String> getTargetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }
    /**
     * Azure resource type
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold.
     * 
     */
    public String getWindowSize() {
        return this.windowSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetricAlertResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<MetricAlertActionResponse> actions;
        private @Nullable Boolean autoMitigate;
        private Object criteria;
        private @Nullable String description;
        private Boolean enabled;
        private String evaluationFrequency;
        private String id;
        private Boolean isMigrated;
        private String lastUpdatedTime;
        private String location;
        private String name;
        private List<String> scopes;
        private Integer severity;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetResourceRegion;
        private @Nullable String targetResourceType;
        private String type;
        private String windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetricAlertResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.autoMitigate = defaults.autoMitigate;
    	      this.criteria = defaults.criteria;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.evaluationFrequency = defaults.evaluationFrequency;
    	      this.id = defaults.id;
    	      this.isMigrated = defaults.isMigrated;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.scopes = defaults.scopes;
    	      this.severity = defaults.severity;
    	      this.tags = defaults.tags;
    	      this.targetResourceRegion = defaults.targetResourceRegion;
    	      this.targetResourceType = defaults.targetResourceType;
    	      this.type = defaults.type;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder setActions(@Nullable List<MetricAlertActionResponse> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setAutoMitigate(@Nullable Boolean autoMitigate) {
            this.autoMitigate = autoMitigate;
            return this;
        }

        public Builder setCriteria(Object criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEvaluationFrequency(String evaluationFrequency) {
            this.evaluationFrequency = Objects.requireNonNull(evaluationFrequency);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsMigrated(Boolean isMigrated) {
            this.isMigrated = Objects.requireNonNull(isMigrated);
            return this;
        }

        public Builder setLastUpdatedTime(String lastUpdatedTime) {
            this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public Builder setSeverity(Integer severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetResourceRegion(@Nullable String targetResourceRegion) {
            this.targetResourceRegion = targetResourceRegion;
            return this;
        }

        public Builder setTargetResourceType(@Nullable String targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWindowSize(String windowSize) {
            this.windowSize = Objects.requireNonNull(windowSize);
            return this;
        }

        public GetMetricAlertResult build() {
            return new GetMetricAlertResult(actions, autoMitigate, criteria, description, enabled, evaluationFrequency, id, isMigrated, lastUpdatedTime, location, name, scopes, severity, tags, targetResourceRegion, targetResourceType, type, windowSize);
        }
    }
}

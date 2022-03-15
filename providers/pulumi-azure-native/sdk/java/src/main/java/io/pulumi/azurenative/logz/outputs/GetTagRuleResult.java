// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.MonitoringTagRulesPropertiesResponse;
import io.pulumi.azurenative.logz.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTagRuleResult {
    /**
     * The id of the rule set.
     * 
     */
    private final String id;
    /**
     * Name of the rule set.
     * 
     */
    private final String name;
    /**
     * Definition of the properties for a TagRules resource.
     * 
     */
    private final MonitoringTagRulesPropertiesResponse properties;
    /**
     * The system metadata relating to this resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the rule set.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetTagRuleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") MonitoringTagRulesPropertiesResponse properties,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * The id of the rule set.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the rule set.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Definition of the properties for a TagRules resource.
     * 
    */
    public MonitoringTagRulesPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * The system metadata relating to this resource
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the rule set.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private MonitoringTagRulesPropertiesResponse properties;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder properties(MonitoringTagRulesPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTagRuleResult build() {
            return new GetTagRuleResult(id, name, properties, systemData, type);
        }
    }
}

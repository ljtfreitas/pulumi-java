// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.CriteriaResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specify action need to be taken when rule type is converting log to metric
 * 
 */
public final class LogToMetricActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogToMetricActionResponse Empty = new LogToMetricActionResponse();

    /**
     * Criteria of Metric
     * 
     */
    @Import(name="criteria", required=true)
      private final List<CriteriaResponse> criteria;

    public List<CriteriaResponse> getCriteria() {
        return this.criteria;
    }

    /**
     * Specifies the action. Supported values - AlertingAction, LogToMetricAction
     * Expected value is 'Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.LogToMetricAction'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public LogToMetricActionResponse(
        List<CriteriaResponse> criteria,
        String odataType) {
        this.criteria = Objects.requireNonNull(criteria, "expected parameter 'criteria' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private LogToMetricActionResponse() {
        this.criteria = List.of();
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogToMetricActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CriteriaResponse> criteria;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(LogToMetricActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.odataType = defaults.odataType;
        }

        public Builder criteria(List<CriteriaResponse> criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public LogToMetricActionResponse build() {
            return new LogToMetricActionResponse(criteria, odataType);
        }
    }
}

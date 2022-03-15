// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RuleManagementEventClaimsDataSourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule management event data source. The discriminator fields is always RuleManagementEventDataSource in this case.
 * 
 */
public final class RuleManagementEventDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleManagementEventDataSourceArgs Empty = new RuleManagementEventDataSourceArgs();

    /**
     * the claims.
     * 
     */
    @Import(name="claims")
      private final @Nullable Output<RuleManagementEventClaimsDataSourceArgs> claims;

    public Output<RuleManagementEventClaimsDataSourceArgs> getClaims() {
        return this.claims == null ? Output.empty() : this.claims;
    }

    /**
     * the event name.
     * 
     */
    @Import(name="eventName")
      private final @Nullable Output<String> eventName;

    public Output<String> getEventName() {
        return this.eventName == null ? Output.empty() : this.eventName;
    }

    /**
     * the event source.
     * 
     */
    @Import(name="eventSource")
      private final @Nullable Output<String> eventSource;

    public Output<String> getEventSource() {
        return this.eventSource == null ? Output.empty() : this.eventSource;
    }

    /**
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    @Import(name="legacyResourceId")
      private final @Nullable Output<String> legacyResourceId;

    public Output<String> getLegacyResourceId() {
        return this.legacyResourceId == null ? Output.empty() : this.legacyResourceId;
    }

    /**
     * the level.
     * 
     */
    @Import(name="level")
      private final @Nullable Output<String> level;

    public Output<String> getLevel() {
        return this.level == null ? Output.empty() : this.level;
    }

    /**
     * the namespace of the metric.
     * 
     */
    @Import(name="metricNamespace")
      private final @Nullable Output<String> metricNamespace;

    public Output<String> getMetricNamespace() {
        return this.metricNamespace == null ? Output.empty() : this.metricNamespace;
    }

    /**
     * specifies the type of data source. There are two types of rule data sources: RuleMetricDataSource and RuleManagementEventDataSource
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The name of the operation that should be checked for. If no name is provided, any operation will match.
     * 
     */
    @Import(name="operationName")
      private final @Nullable Output<String> operationName;

    public Output<String> getOperationName() {
        return this.operationName == null ? Output.empty() : this.operationName;
    }

    /**
     * the resource group name.
     * 
     */
    @Import(name="resourceGroupName")
      private final @Nullable Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName == null ? Output.empty() : this.resourceGroupName;
    }

    /**
     * the location of the resource.
     * 
     */
    @Import(name="resourceLocation")
      private final @Nullable Output<String> resourceLocation;

    public Output<String> getResourceLocation() {
        return this.resourceLocation == null ? Output.empty() : this.resourceLocation;
    }

    /**
     * the resource provider name.
     * 
     */
    @Import(name="resourceProviderName")
      private final @Nullable Output<String> resourceProviderName;

    public Output<String> getResourceProviderName() {
        return this.resourceProviderName == null ? Output.empty() : this.resourceProviderName;
    }

    /**
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    @Import(name="resourceUri")
      private final @Nullable Output<String> resourceUri;

    public Output<String> getResourceUri() {
        return this.resourceUri == null ? Output.empty() : this.resourceUri;
    }

    /**
     * The status of the operation that should be checked for. If no status is provided, any status will match.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * the substatus.
     * 
     */
    @Import(name="subStatus")
      private final @Nullable Output<String> subStatus;

    public Output<String> getSubStatus() {
        return this.subStatus == null ? Output.empty() : this.subStatus;
    }

    public RuleManagementEventDataSourceArgs(
        @Nullable Output<RuleManagementEventClaimsDataSourceArgs> claims,
        @Nullable Output<String> eventName,
        @Nullable Output<String> eventSource,
        @Nullable Output<String> legacyResourceId,
        @Nullable Output<String> level,
        @Nullable Output<String> metricNamespace,
        Output<String> odataType,
        @Nullable Output<String> operationName,
        @Nullable Output<String> resourceGroupName,
        @Nullable Output<String> resourceLocation,
        @Nullable Output<String> resourceProviderName,
        @Nullable Output<String> resourceUri,
        @Nullable Output<String> status,
        @Nullable Output<String> subStatus) {
        this.claims = claims;
        this.eventName = eventName;
        this.eventSource = eventSource;
        this.legacyResourceId = legacyResourceId;
        this.level = level;
        this.metricNamespace = metricNamespace;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operationName = operationName;
        this.resourceGroupName = resourceGroupName;
        this.resourceLocation = resourceLocation;
        this.resourceProviderName = resourceProviderName;
        this.resourceUri = resourceUri;
        this.status = status;
        this.subStatus = subStatus;
    }

    private RuleManagementEventDataSourceArgs() {
        this.claims = Output.empty();
        this.eventName = Output.empty();
        this.eventSource = Output.empty();
        this.legacyResourceId = Output.empty();
        this.level = Output.empty();
        this.metricNamespace = Output.empty();
        this.odataType = Output.empty();
        this.operationName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceLocation = Output.empty();
        this.resourceProviderName = Output.empty();
        this.resourceUri = Output.empty();
        this.status = Output.empty();
        this.subStatus = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleManagementEventDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleManagementEventClaimsDataSourceArgs> claims;
        private @Nullable Output<String> eventName;
        private @Nullable Output<String> eventSource;
        private @Nullable Output<String> legacyResourceId;
        private @Nullable Output<String> level;
        private @Nullable Output<String> metricNamespace;
        private Output<String> odataType;
        private @Nullable Output<String> operationName;
        private @Nullable Output<String> resourceGroupName;
        private @Nullable Output<String> resourceLocation;
        private @Nullable Output<String> resourceProviderName;
        private @Nullable Output<String> resourceUri;
        private @Nullable Output<String> status;
        private @Nullable Output<String> subStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleManagementEventDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claims = defaults.claims;
    	      this.eventName = defaults.eventName;
    	      this.eventSource = defaults.eventSource;
    	      this.legacyResourceId = defaults.legacyResourceId;
    	      this.level = defaults.level;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.odataType = defaults.odataType;
    	      this.operationName = defaults.operationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceProviderName = defaults.resourceProviderName;
    	      this.resourceUri = defaults.resourceUri;
    	      this.status = defaults.status;
    	      this.subStatus = defaults.subStatus;
        }

        public Builder claims(@Nullable Output<RuleManagementEventClaimsDataSourceArgs> claims) {
            this.claims = claims;
            return this;
        }

        public Builder claims(@Nullable RuleManagementEventClaimsDataSourceArgs claims) {
            this.claims = Output.ofNullable(claims);
            return this;
        }

        public Builder eventName(@Nullable Output<String> eventName) {
            this.eventName = eventName;
            return this;
        }

        public Builder eventName(@Nullable String eventName) {
            this.eventName = Output.ofNullable(eventName);
            return this;
        }

        public Builder eventSource(@Nullable Output<String> eventSource) {
            this.eventSource = eventSource;
            return this;
        }

        public Builder eventSource(@Nullable String eventSource) {
            this.eventSource = Output.ofNullable(eventSource);
            return this;
        }

        public Builder legacyResourceId(@Nullable Output<String> legacyResourceId) {
            this.legacyResourceId = legacyResourceId;
            return this;
        }

        public Builder legacyResourceId(@Nullable String legacyResourceId) {
            this.legacyResourceId = Output.ofNullable(legacyResourceId);
            return this;
        }

        public Builder level(@Nullable Output<String> level) {
            this.level = level;
            return this;
        }

        public Builder level(@Nullable String level) {
            this.level = Output.ofNullable(level);
            return this;
        }

        public Builder metricNamespace(@Nullable Output<String> metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder metricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = Output.ofNullable(metricNamespace);
            return this;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder operationName(@Nullable Output<String> operationName) {
            this.operationName = operationName;
            return this;
        }

        public Builder operationName(@Nullable String operationName) {
            this.operationName = Output.ofNullable(operationName);
            return this;
        }

        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = Output.ofNullable(resourceGroupName);
            return this;
        }

        public Builder resourceLocation(@Nullable Output<String> resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }

        public Builder resourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = Output.ofNullable(resourceLocation);
            return this;
        }

        public Builder resourceProviderName(@Nullable Output<String> resourceProviderName) {
            this.resourceProviderName = resourceProviderName;
            return this;
        }

        public Builder resourceProviderName(@Nullable String resourceProviderName) {
            this.resourceProviderName = Output.ofNullable(resourceProviderName);
            return this;
        }

        public Builder resourceUri(@Nullable Output<String> resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder resourceUri(@Nullable String resourceUri) {
            this.resourceUri = Output.ofNullable(resourceUri);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder subStatus(@Nullable Output<String> subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public Builder subStatus(@Nullable String subStatus) {
            this.subStatus = Output.ofNullable(subStatus);
            return this;
        }
        public RuleManagementEventDataSourceArgs build() {
            return new RuleManagementEventDataSourceArgs(claims, eventName, eventSource, legacyResourceId, level, metricNamespace, odataType, operationName, resourceGroupName, resourceLocation, resourceProviderName, resourceUri, status, subStatus);
        }
    }
}

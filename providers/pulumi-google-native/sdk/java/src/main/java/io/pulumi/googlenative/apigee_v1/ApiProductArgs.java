// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AttributeArgs;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1GraphQLOperationGroupArgs;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1OperationGroupArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiProductArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiProductArgs Empty = new ApiProductArgs();

    @InputImport(name="apiResources")
    private final @Nullable Input<List<String>> apiResources;

    public Input<List<String>> getApiResources() {
        return this.apiResources == null ? Input.empty() : this.apiResources;
    }

    @InputImport(name="approvalType")
    private final @Nullable Input<String> approvalType;

    public Input<String> getApprovalType() {
        return this.approvalType == null ? Input.empty() : this.approvalType;
    }

    @InputImport(name="attributes")
    private final @Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> attributes;

    public Input<List<GoogleCloudApigeeV1AttributeArgs>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    @InputImport(name="createdAt")
    private final @Nullable Input<String> createdAt;

    public Input<String> getCreatedAt() {
        return this.createdAt == null ? Input.empty() : this.createdAt;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="environments")
    private final @Nullable Input<List<String>> environments;

    public Input<List<String>> getEnvironments() {
        return this.environments == null ? Input.empty() : this.environments;
    }

    @InputImport(name="graphqlOperationGroup")
    private final @Nullable Input<GoogleCloudApigeeV1GraphQLOperationGroupArgs> graphqlOperationGroup;

    public Input<GoogleCloudApigeeV1GraphQLOperationGroupArgs> getGraphqlOperationGroup() {
        return this.graphqlOperationGroup == null ? Input.empty() : this.graphqlOperationGroup;
    }

    @InputImport(name="lastModifiedAt")
    private final @Nullable Input<String> lastModifiedAt;

    public Input<String> getLastModifiedAt() {
        return this.lastModifiedAt == null ? Input.empty() : this.lastModifiedAt;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="operationGroup")
    private final @Nullable Input<GoogleCloudApigeeV1OperationGroupArgs> operationGroup;

    public Input<GoogleCloudApigeeV1OperationGroupArgs> getOperationGroup() {
        return this.operationGroup == null ? Input.empty() : this.operationGroup;
    }

    @InputImport(name="organizationId", required=true)
    private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    @InputImport(name="proxies")
    private final @Nullable Input<List<String>> proxies;

    public Input<List<String>> getProxies() {
        return this.proxies == null ? Input.empty() : this.proxies;
    }

    @InputImport(name="quota")
    private final @Nullable Input<String> quota;

    public Input<String> getQuota() {
        return this.quota == null ? Input.empty() : this.quota;
    }

    @InputImport(name="quotaInterval")
    private final @Nullable Input<String> quotaInterval;

    public Input<String> getQuotaInterval() {
        return this.quotaInterval == null ? Input.empty() : this.quotaInterval;
    }

    @InputImport(name="quotaTimeUnit")
    private final @Nullable Input<String> quotaTimeUnit;

    public Input<String> getQuotaTimeUnit() {
        return this.quotaTimeUnit == null ? Input.empty() : this.quotaTimeUnit;
    }

    @InputImport(name="scopes")
    private final @Nullable Input<List<String>> scopes;

    public Input<List<String>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    public ApiProductArgs(
        @Nullable Input<List<String>> apiResources,
        @Nullable Input<String> approvalType,
        @Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> attributes,
        @Nullable Input<String> createdAt,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<List<String>> environments,
        @Nullable Input<GoogleCloudApigeeV1GraphQLOperationGroupArgs> graphqlOperationGroup,
        @Nullable Input<String> lastModifiedAt,
        @Nullable Input<String> name,
        @Nullable Input<GoogleCloudApigeeV1OperationGroupArgs> operationGroup,
        Input<String> organizationId,
        @Nullable Input<List<String>> proxies,
        @Nullable Input<String> quota,
        @Nullable Input<String> quotaInterval,
        @Nullable Input<String> quotaTimeUnit,
        @Nullable Input<List<String>> scopes) {
        this.apiResources = apiResources;
        this.approvalType = approvalType;
        this.attributes = attributes;
        this.createdAt = createdAt;
        this.description = description;
        this.displayName = displayName;
        this.environments = environments;
        this.graphqlOperationGroup = graphqlOperationGroup;
        this.lastModifiedAt = lastModifiedAt;
        this.name = name;
        this.operationGroup = operationGroup;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.proxies = proxies;
        this.quota = quota;
        this.quotaInterval = quotaInterval;
        this.quotaTimeUnit = quotaTimeUnit;
        this.scopes = scopes;
    }

    private ApiProductArgs() {
        this.apiResources = Input.empty();
        this.approvalType = Input.empty();
        this.attributes = Input.empty();
        this.createdAt = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.environments = Input.empty();
        this.graphqlOperationGroup = Input.empty();
        this.lastModifiedAt = Input.empty();
        this.name = Input.empty();
        this.operationGroup = Input.empty();
        this.organizationId = Input.empty();
        this.proxies = Input.empty();
        this.quota = Input.empty();
        this.quotaInterval = Input.empty();
        this.quotaTimeUnit = Input.empty();
        this.scopes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> apiResources;
        private @Nullable Input<String> approvalType;
        private @Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> attributes;
        private @Nullable Input<String> createdAt;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<List<String>> environments;
        private @Nullable Input<GoogleCloudApigeeV1GraphQLOperationGroupArgs> graphqlOperationGroup;
        private @Nullable Input<String> lastModifiedAt;
        private @Nullable Input<String> name;
        private @Nullable Input<GoogleCloudApigeeV1OperationGroupArgs> operationGroup;
        private Input<String> organizationId;
        private @Nullable Input<List<String>> proxies;
        private @Nullable Input<String> quota;
        private @Nullable Input<String> quotaInterval;
        private @Nullable Input<String> quotaTimeUnit;
        private @Nullable Input<List<String>> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiResources = defaults.apiResources;
    	      this.approvalType = defaults.approvalType;
    	      this.attributes = defaults.attributes;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.environments = defaults.environments;
    	      this.graphqlOperationGroup = defaults.graphqlOperationGroup;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.operationGroup = defaults.operationGroup;
    	      this.organizationId = defaults.organizationId;
    	      this.proxies = defaults.proxies;
    	      this.quota = defaults.quota;
    	      this.quotaInterval = defaults.quotaInterval;
    	      this.quotaTimeUnit = defaults.quotaTimeUnit;
    	      this.scopes = defaults.scopes;
        }

        public Builder setApiResources(@Nullable Input<List<String>> apiResources) {
            this.apiResources = apiResources;
            return this;
        }

        public Builder setApiResources(@Nullable List<String> apiResources) {
            this.apiResources = Input.ofNullable(apiResources);
            return this;
        }

        public Builder setApprovalType(@Nullable Input<String> approvalType) {
            this.approvalType = approvalType;
            return this;
        }

        public Builder setApprovalType(@Nullable String approvalType) {
            this.approvalType = Input.ofNullable(approvalType);
            return this;
        }

        public Builder setAttributes(@Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable List<GoogleCloudApigeeV1AttributeArgs> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setCreatedAt(@Nullable Input<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = Input.ofNullable(createdAt);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEnvironments(@Nullable Input<List<String>> environments) {
            this.environments = environments;
            return this;
        }

        public Builder setEnvironments(@Nullable List<String> environments) {
            this.environments = Input.ofNullable(environments);
            return this;
        }

        public Builder setGraphqlOperationGroup(@Nullable Input<GoogleCloudApigeeV1GraphQLOperationGroupArgs> graphqlOperationGroup) {
            this.graphqlOperationGroup = graphqlOperationGroup;
            return this;
        }

        public Builder setGraphqlOperationGroup(@Nullable GoogleCloudApigeeV1GraphQLOperationGroupArgs graphqlOperationGroup) {
            this.graphqlOperationGroup = Input.ofNullable(graphqlOperationGroup);
            return this;
        }

        public Builder setLastModifiedAt(@Nullable Input<String> lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder setLastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = Input.ofNullable(lastModifiedAt);
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

        public Builder setOperationGroup(@Nullable Input<GoogleCloudApigeeV1OperationGroupArgs> operationGroup) {
            this.operationGroup = operationGroup;
            return this;
        }

        public Builder setOperationGroup(@Nullable GoogleCloudApigeeV1OperationGroupArgs operationGroup) {
            this.operationGroup = Input.ofNullable(operationGroup);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder setProxies(@Nullable Input<List<String>> proxies) {
            this.proxies = proxies;
            return this;
        }

        public Builder setProxies(@Nullable List<String> proxies) {
            this.proxies = Input.ofNullable(proxies);
            return this;
        }

        public Builder setQuota(@Nullable Input<String> quota) {
            this.quota = quota;
            return this;
        }

        public Builder setQuota(@Nullable String quota) {
            this.quota = Input.ofNullable(quota);
            return this;
        }

        public Builder setQuotaInterval(@Nullable Input<String> quotaInterval) {
            this.quotaInterval = quotaInterval;
            return this;
        }

        public Builder setQuotaInterval(@Nullable String quotaInterval) {
            this.quotaInterval = Input.ofNullable(quotaInterval);
            return this;
        }

        public Builder setQuotaTimeUnit(@Nullable Input<String> quotaTimeUnit) {
            this.quotaTimeUnit = quotaTimeUnit;
            return this;
        }

        public Builder setQuotaTimeUnit(@Nullable String quotaTimeUnit) {
            this.quotaTimeUnit = Input.ofNullable(quotaTimeUnit);
            return this;
        }

        public Builder setScopes(@Nullable Input<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }

        public ApiProductArgs build() {
            return new ApiProductArgs(apiResources, approvalType, attributes, createdAt, description, displayName, environments, graphqlOperationGroup, lastModifiedAt, name, operationGroup, organizationId, proxies, quota, quotaInterval, quotaTimeUnit, scopes);
        }
    }
}
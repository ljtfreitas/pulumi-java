// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiMappingState extends io.pulumi.resources.ResourceArgs {

    public static final ApiMappingState Empty = new ApiMappingState();

    /**
     * The API identifier.
     * 
     */
    @InputImport(name="apiId")
    private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
     * 
     */
    @InputImport(name="apiMappingKey")
    private final @Nullable Input<String> apiMappingKey;

    public Input<String> getApiMappingKey() {
        return this.apiMappingKey == null ? Input.empty() : this.apiMappingKey;
    }

    /**
     * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
     * 
     */
    @InputImport(name="domainName")
    private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
     * 
     */
    @InputImport(name="stage")
    private final @Nullable Input<String> stage;

    public Input<String> getStage() {
        return this.stage == null ? Input.empty() : this.stage;
    }

    public ApiMappingState(
        @Nullable Input<String> apiId,
        @Nullable Input<String> apiMappingKey,
        @Nullable Input<String> domainName,
        @Nullable Input<String> stage) {
        this.apiId = apiId;
        this.apiMappingKey = apiMappingKey;
        this.domainName = domainName;
        this.stage = stage;
    }

    private ApiMappingState() {
        this.apiId = Input.empty();
        this.apiMappingKey = Input.empty();
        this.domainName = Input.empty();
        this.stage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> apiMappingKey;
        private @Nullable Input<String> domainName;
        private @Nullable Input<String> stage;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiMappingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.apiMappingKey = defaults.apiMappingKey;
    	      this.domainName = defaults.domainName;
    	      this.stage = defaults.stage;
        }

        public Builder setApiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder setApiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder setApiMappingKey(@Nullable Input<String> apiMappingKey) {
            this.apiMappingKey = apiMappingKey;
            return this;
        }

        public Builder setApiMappingKey(@Nullable String apiMappingKey) {
            this.apiMappingKey = Input.ofNullable(apiMappingKey);
            return this;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setStage(@Nullable Input<String> stage) {
            this.stage = stage;
            return this;
        }

        public Builder setStage(@Nullable String stage) {
            this.stage = Input.ofNullable(stage);
            return this;
        }
        public ApiMappingState build() {
            return new ApiMappingState(apiId, apiMappingKey, domainName, stage);
        }
    }
}

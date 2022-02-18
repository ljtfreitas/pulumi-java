// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.outputs.WebActivityAuthenticationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebActivityResponse {
    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    private final @Nullable WebActivityAuthenticationResponse authentication;
    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object body;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * List of datasets passed to web endpoint.
     * 
     */
    private final @Nullable List<DatasetReferenceResponse> datasets;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object headers;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * List of linked services passed to web endpoint.
     * 
     */
    private final @Nullable List<LinkedServiceReferenceResponse> linkedServices;
    /**
     * Rest API method for target endpoint.
     * 
     */
    private final String method;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Type of activity.
     * Expected value is 'WebActivity'.
     * 
     */
    private final String type;
    /**
     * Web activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    private final Object url;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"authentication","body","connectVia","datasets","dependsOn","description","headers","linkedServiceName","linkedServices","method","name","policy","type","url","userProperties"})
    private WebActivityResponse(
        @Nullable WebActivityAuthenticationResponse authentication,
        @Nullable Object body,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable List<DatasetReferenceResponse> datasets,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object headers,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @Nullable List<LinkedServiceReferenceResponse> linkedServices,
        String method,
        String name,
        @Nullable ActivityPolicyResponse policy,
        String type,
        Object url,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.authentication = authentication;
        this.body = body;
        this.connectVia = connectVia;
        this.datasets = datasets;
        this.dependsOn = dependsOn;
        this.description = description;
        this.headers = headers;
        this.linkedServiceName = linkedServiceName;
        this.linkedServices = linkedServices;
        this.method = Objects.requireNonNull(method);
        this.name = Objects.requireNonNull(name);
        this.policy = policy;
        this.type = Objects.requireNonNull(type);
        this.url = Objects.requireNonNull(url);
        this.userProperties = userProperties;
    }

    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    public Optional<WebActivityAuthenticationResponse> getAuthentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * List of datasets passed to web endpoint.
     * 
     */
    public List<DatasetReferenceResponse> getDatasets() {
        return this.datasets == null ? List.of() : this.datasets;
    }
    /**
     * Activity depends on condition.
     * 
     */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getHeaders() {
        return Optional.ofNullable(this.headers);
    }
    /**
     * Linked service reference.
     * 
     */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * List of linked services passed to web endpoint.
     * 
     */
    public List<LinkedServiceReferenceResponse> getLinkedServices() {
        return this.linkedServices == null ? List.of() : this.linkedServices;
    }
    /**
     * Rest API method for target endpoint.
     * 
     */
    public String getMethod() {
        return this.method;
    }
    /**
     * Activity name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
     */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Type of activity.
     * Expected value is 'WebActivity'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Web activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    public Object getUrl() {
        return this.url;
    }
    /**
     * Activity user properties.
     * 
     */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebActivityAuthenticationResponse authentication;
        private @Nullable Object body;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable List<DatasetReferenceResponse> datasets;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object headers;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable List<LinkedServiceReferenceResponse> linkedServices;
        private String method;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private Object url;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WebActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.connectVia = defaults.connectVia;
    	      this.datasets = defaults.datasets;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.linkedServices = defaults.linkedServices;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setAuthentication(@Nullable WebActivityAuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setBody(@Nullable Object body) {
            this.body = body;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDatasets(@Nullable List<DatasetReferenceResponse> datasets) {
            this.datasets = datasets;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setHeaders(@Nullable Object headers) {
            this.headers = headers;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServices(@Nullable List<LinkedServiceReferenceResponse> linkedServices) {
            this.linkedServices = linkedServices;
            return this;
        }

        public Builder setMethod(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public WebActivityResponse build() {
            return new WebActivityResponse(authentication, body, connectVia, datasets, dependsOn, description, headers, linkedServiceName, linkedServices, method, name, policy, type, url, userProperties);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.WebActivityMethod;
import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.azurenative.datafactory.inputs.WebActivityAuthenticationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Web activity.
 * 
 */
public final class WebActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebActivityArgs Empty = new WebActivityArgs();

    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    @InputImport(name="authentication")
        private final @Nullable Input<WebActivityAuthenticationArgs> authentication;

    public Input<WebActivityAuthenticationArgs> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="body")
        private final @Nullable Input<Object> body;

    public Input<Object> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
        private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    /**
     * List of datasets passed to web endpoint.
     * 
     */
    @InputImport(name="datasets")
        private final @Nullable Input<List<DatasetReferenceArgs>> datasets;

    public Input<List<DatasetReferenceArgs>> getDatasets() {
        return this.datasets == null ? Input.empty() : this.datasets;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
        private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="headers")
        private final @Nullable Input<Object> headers;

    public Input<Object> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
        private final @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    /**
     * List of linked services passed to web endpoint.
     * 
     */
    @InputImport(name="linkedServices")
        private final @Nullable Input<List<LinkedServiceReferenceArgs>> linkedServices;

    public Input<List<LinkedServiceReferenceArgs>> getLinkedServices() {
        return this.linkedServices == null ? Input.empty() : this.linkedServices;
    }

    /**
     * Rest API method for target endpoint.
     * 
     */
    @InputImport(name="method", required=true)
        private final Input<Either<String,WebActivityMethod>> method;

    public Input<Either<String,WebActivityMethod>> getMethod() {
        return this.method;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
        private final @Nullable Input<ActivityPolicyArgs> policy;

    public Input<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * Type of activity.
     * Expected value is 'WebActivity'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Web activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="url", required=true)
        private final Input<Object> url;

    public Input<Object> getUrl() {
        return this.url;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
        private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    public WebActivityArgs(
        @Nullable Input<WebActivityAuthenticationArgs> authentication,
        @Nullable Input<Object> body,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<List<DatasetReferenceArgs>> datasets,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<Object> headers,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<List<LinkedServiceReferenceArgs>> linkedServices,
        Input<Either<String,WebActivityMethod>> method,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        Input<String> type,
        Input<Object> url,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.authentication = authentication;
        this.body = body;
        this.connectVia = connectVia;
        this.datasets = datasets;
        this.dependsOn = dependsOn;
        this.description = description;
        this.headers = headers;
        this.linkedServiceName = linkedServiceName;
        this.linkedServices = linkedServices;
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userProperties = userProperties;
    }

    private WebActivityArgs() {
        this.authentication = Input.empty();
        this.body = Input.empty();
        this.connectVia = Input.empty();
        this.datasets = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.headers = Input.empty();
        this.linkedServiceName = Input.empty();
        this.linkedServices = Input.empty();
        this.method = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.type = Input.empty();
        this.url = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebActivityAuthenticationArgs> authentication;
        private @Nullable Input<Object> body;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<List<DatasetReferenceArgs>> datasets;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> headers;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<List<LinkedServiceReferenceArgs>> linkedServices;
        private Input<Either<String,WebActivityMethod>> method;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private Input<String> type;
        private Input<Object> url;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WebActivityArgs defaults) {
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

        public Builder setAuthentication(@Nullable Input<WebActivityAuthenticationArgs> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setAuthentication(@Nullable WebActivityAuthenticationArgs authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder setBody(@Nullable Input<Object> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable Object body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setConnectVia(@Nullable Input<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Input.ofNullable(connectVia);
            return this;
        }

        public Builder setDatasets(@Nullable Input<List<DatasetReferenceArgs>> datasets) {
            this.datasets = datasets;
            return this;
        }

        public Builder setDatasets(@Nullable List<DatasetReferenceArgs> datasets) {
            this.datasets = Input.ofNullable(datasets);
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
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

        public Builder setHeaders(@Nullable Input<Object> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable Object headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setLinkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
            return this;
        }

        public Builder setLinkedServices(@Nullable Input<List<LinkedServiceReferenceArgs>> linkedServices) {
            this.linkedServices = linkedServices;
            return this;
        }

        public Builder setLinkedServices(@Nullable List<LinkedServiceReferenceArgs> linkedServices) {
            this.linkedServices = Input.ofNullable(linkedServices);
            return this;
        }

        public Builder setMethod(Input<Either<String,WebActivityMethod>> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setMethod(Either<String,WebActivityMethod> method) {
            this.method = Input.of(Objects.requireNonNull(method));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPolicy(@Nullable Input<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUrl(Input<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }
        public WebActivityArgs build() {
            return new WebActivityArgs(authentication, body, connectVia, datasets, dependsOn, description, headers, linkedServiceName, linkedServices, method, name, policy, type, url, userProperties);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.AzureFunctionActivityMethod;
import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Function activity.
 * 
 */
public final class AzureFunctionActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFunctionActivityArgs Empty = new AzureFunctionActivityArgs();

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
     * Name of the Function that the Azure Function Activity will call. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="functionName", required=true)
    private final Input<Object> functionName;

    public Input<Object> getFunctionName() {
        return this.functionName;
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
     * Rest API method for target endpoint.
     * 
     */
    @InputImport(name="method", required=true)
    private final Input<Either<String,AzureFunctionActivityMethod>> method;

    public Input<Either<String,AzureFunctionActivityMethod>> getMethod() {
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
     * Expected value is 'AzureFunctionActivity'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
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

    public AzureFunctionActivityArgs(
        @Nullable Input<Object> body,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        Input<Object> functionName,
        @Nullable Input<Object> headers,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        Input<Either<String,AzureFunctionActivityMethod>> method,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.body = body;
        this.dependsOn = dependsOn;
        this.description = description;
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.headers = headers;
        this.linkedServiceName = linkedServiceName;
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private AzureFunctionActivityArgs() {
        this.body = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.functionName = Input.empty();
        this.headers = Input.empty();
        this.linkedServiceName = Input.empty();
        this.method = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> body;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private Input<Object> functionName;
        private @Nullable Input<Object> headers;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private Input<Either<String,AzureFunctionActivityMethod>> method;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.functionName = defaults.functionName;
    	      this.headers = defaults.headers;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setBody(@Nullable Input<Object> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable Object body) {
            this.body = Input.ofNullable(body);
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

        public Builder setFunctionName(Input<Object> functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setFunctionName(Object functionName) {
            this.functionName = Input.of(Objects.requireNonNull(functionName));
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

        public Builder setMethod(Input<Either<String,AzureFunctionActivityMethod>> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setMethod(Either<String,AzureFunctionActivityMethod> method) {
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

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }

        public AzureFunctionActivityArgs build() {
            return new AzureFunctionActivityArgs(body, dependsOn, description, functionName, headers, linkedServiceName, method, name, policy, type, userProperties);
        }
    }
}

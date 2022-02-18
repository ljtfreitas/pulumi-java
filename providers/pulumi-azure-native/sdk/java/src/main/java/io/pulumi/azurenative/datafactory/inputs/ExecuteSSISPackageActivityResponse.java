// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.SSISExecutionCredentialResponse;
import io.pulumi.azurenative.datafactory.inputs.SSISExecutionParameterResponse;
import io.pulumi.azurenative.datafactory.inputs.SSISLogLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.SSISPackageLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.SSISPropertyOverrideResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execute SSIS package activity.
 * 
 */
public final class ExecuteSSISPackageActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecuteSSISPackageActivityResponse Empty = new ExecuteSSISPackageActivityResponse();

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia", required=true)
    private final IntegrationRuntimeReferenceResponse connectVia;

    public IntegrationRuntimeReferenceResponse getConnectVia() {
        return this.connectVia;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The environment path to execute the SSIS package. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="environmentPath")
    private final @Nullable Object environmentPath;

    public Optional<Object> getEnvironmentPath() {
        return this.environmentPath == null ? Optional.empty() : Optional.ofNullable(this.environmentPath);
    }

    /**
     * The package execution credential.
     * 
     */
    @InputImport(name="executionCredential")
    private final @Nullable SSISExecutionCredentialResponse executionCredential;

    public Optional<SSISExecutionCredentialResponse> getExecutionCredential() {
        return this.executionCredential == null ? Optional.empty() : Optional.ofNullable(this.executionCredential);
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * SSIS package execution log location.
     * 
     */
    @InputImport(name="logLocation")
    private final @Nullable SSISLogLocationResponse logLocation;

    public Optional<SSISLogLocationResponse> getLogLocation() {
        return this.logLocation == null ? Optional.empty() : Optional.ofNullable(this.logLocation);
    }

    /**
     * The logging level of SSIS package execution. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="loggingLevel")
    private final @Nullable Object loggingLevel;

    public Optional<Object> getLoggingLevel() {
        return this.loggingLevel == null ? Optional.empty() : Optional.ofNullable(this.loggingLevel);
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The package level connection managers to execute the SSIS package.
     * 
     */
    @InputImport(name="packageConnectionManagers")
    private final @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> packageConnectionManagers;

    public Map<String,Map<String,SSISExecutionParameterResponse>> getPackageConnectionManagers() {
        return this.packageConnectionManagers == null ? Map.of() : this.packageConnectionManagers;
    }

    /**
     * SSIS package location.
     * 
     */
    @InputImport(name="packageLocation", required=true)
    private final SSISPackageLocationResponse packageLocation;

    public SSISPackageLocationResponse getPackageLocation() {
        return this.packageLocation;
    }

    /**
     * The package level parameters to execute the SSIS package.
     * 
     */
    @InputImport(name="packageParameters")
    private final @Nullable Map<String,SSISExecutionParameterResponse> packageParameters;

    public Map<String,SSISExecutionParameterResponse> getPackageParameters() {
        return this.packageParameters == null ? Map.of() : this.packageParameters;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * The project level connection managers to execute the SSIS package.
     * 
     */
    @InputImport(name="projectConnectionManagers")
    private final @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> projectConnectionManagers;

    public Map<String,Map<String,SSISExecutionParameterResponse>> getProjectConnectionManagers() {
        return this.projectConnectionManagers == null ? Map.of() : this.projectConnectionManagers;
    }

    /**
     * The project level parameters to execute the SSIS package.
     * 
     */
    @InputImport(name="projectParameters")
    private final @Nullable Map<String,SSISExecutionParameterResponse> projectParameters;

    public Map<String,SSISExecutionParameterResponse> getProjectParameters() {
        return this.projectParameters == null ? Map.of() : this.projectParameters;
    }

    /**
     * The property overrides to execute the SSIS package.
     * 
     */
    @InputImport(name="propertyOverrides")
    private final @Nullable Map<String,SSISPropertyOverrideResponse> propertyOverrides;

    public Map<String,SSISPropertyOverrideResponse> getPropertyOverrides() {
        return this.propertyOverrides == null ? Map.of() : this.propertyOverrides;
    }

    /**
     * Specifies the runtime to execute SSIS package. The value should be "x86" or "x64". Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="runtime")
    private final @Nullable Object runtime;

    public Optional<Object> getRuntime() {
        return this.runtime == null ? Optional.empty() : Optional.ofNullable(this.runtime);
    }

    /**
     * Type of activity.
     * Expected value is 'ExecuteSSISPackage'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public ExecuteSSISPackageActivityResponse(
        IntegrationRuntimeReferenceResponse connectVia,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object environmentPath,
        @Nullable SSISExecutionCredentialResponse executionCredential,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @Nullable SSISLogLocationResponse logLocation,
        @Nullable Object loggingLevel,
        String name,
        @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> packageConnectionManagers,
        SSISPackageLocationResponse packageLocation,
        @Nullable Map<String,SSISExecutionParameterResponse> packageParameters,
        @Nullable ActivityPolicyResponse policy,
        @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> projectConnectionManagers,
        @Nullable Map<String,SSISExecutionParameterResponse> projectParameters,
        @Nullable Map<String,SSISPropertyOverrideResponse> propertyOverrides,
        @Nullable Object runtime,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.connectVia = Objects.requireNonNull(connectVia, "expected parameter 'connectVia' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.environmentPath = environmentPath;
        this.executionCredential = executionCredential;
        this.linkedServiceName = linkedServiceName;
        this.logLocation = logLocation;
        this.loggingLevel = loggingLevel;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.packageConnectionManagers = packageConnectionManagers;
        this.packageLocation = Objects.requireNonNull(packageLocation, "expected parameter 'packageLocation' to be non-null");
        this.packageParameters = packageParameters;
        this.policy = policy;
        this.projectConnectionManagers = projectConnectionManagers;
        this.projectParameters = projectParameters;
        this.propertyOverrides = propertyOverrides;
        this.runtime = runtime;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private ExecuteSSISPackageActivityResponse() {
        this.connectVia = null;
        this.dependsOn = List.of();
        this.description = null;
        this.environmentPath = null;
        this.executionCredential = null;
        this.linkedServiceName = null;
        this.logLocation = null;
        this.loggingLevel = null;
        this.name = null;
        this.packageConnectionManagers = Map.of();
        this.packageLocation = null;
        this.packageParameters = Map.of();
        this.policy = null;
        this.projectConnectionManagers = Map.of();
        this.projectParameters = Map.of();
        this.propertyOverrides = Map.of();
        this.runtime = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteSSISPackageActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object environmentPath;
        private @Nullable SSISExecutionCredentialResponse executionCredential;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable SSISLogLocationResponse logLocation;
        private @Nullable Object loggingLevel;
        private String name;
        private @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> packageConnectionManagers;
        private SSISPackageLocationResponse packageLocation;
        private @Nullable Map<String,SSISExecutionParameterResponse> packageParameters;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> projectConnectionManagers;
        private @Nullable Map<String,SSISExecutionParameterResponse> projectParameters;
        private @Nullable Map<String,SSISPropertyOverrideResponse> propertyOverrides;
        private @Nullable Object runtime;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecuteSSISPackageActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVia = defaults.connectVia;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.environmentPath = defaults.environmentPath;
    	      this.executionCredential = defaults.executionCredential;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.logLocation = defaults.logLocation;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.name = defaults.name;
    	      this.packageConnectionManagers = defaults.packageConnectionManagers;
    	      this.packageLocation = defaults.packageLocation;
    	      this.packageParameters = defaults.packageParameters;
    	      this.policy = defaults.policy;
    	      this.projectConnectionManagers = defaults.projectConnectionManagers;
    	      this.projectParameters = defaults.projectParameters;
    	      this.propertyOverrides = defaults.propertyOverrides;
    	      this.runtime = defaults.runtime;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setConnectVia(IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = Objects.requireNonNull(connectVia);
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

        public Builder setEnvironmentPath(@Nullable Object environmentPath) {
            this.environmentPath = environmentPath;
            return this;
        }

        public Builder setExecutionCredential(@Nullable SSISExecutionCredentialResponse executionCredential) {
            this.executionCredential = executionCredential;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLogLocation(@Nullable SSISLogLocationResponse logLocation) {
            this.logLocation = logLocation;
            return this;
        }

        public Builder setLoggingLevel(@Nullable Object loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPackageConnectionManagers(@Nullable Map<String,Map<String,SSISExecutionParameterResponse>> packageConnectionManagers) {
            this.packageConnectionManagers = packageConnectionManagers;
            return this;
        }

        public Builder setPackageLocation(SSISPackageLocationResponse packageLocation) {
            this.packageLocation = Objects.requireNonNull(packageLocation);
            return this;
        }

        public Builder setPackageParameters(@Nullable Map<String,SSISExecutionParameterResponse> packageParameters) {
            this.packageParameters = packageParameters;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setProjectConnectionManagers(@Nullable Map<String,Map<String,SSISExecutionParameterResponse>> projectConnectionManagers) {
            this.projectConnectionManagers = projectConnectionManagers;
            return this;
        }

        public Builder setProjectParameters(@Nullable Map<String,SSISExecutionParameterResponse> projectParameters) {
            this.projectParameters = projectParameters;
            return this;
        }

        public Builder setPropertyOverrides(@Nullable Map<String,SSISPropertyOverrideResponse> propertyOverrides) {
            this.propertyOverrides = propertyOverrides;
            return this;
        }

        public Builder setRuntime(@Nullable Object runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public ExecuteSSISPackageActivityResponse build() {
            return new ExecuteSSISPackageActivityResponse(connectVia, dependsOn, description, environmentPath, executionCredential, linkedServiceName, logLocation, loggingLevel, name, packageConnectionManagers, packageLocation, packageParameters, policy, projectConnectionManagers, projectParameters, propertyOverrides, runtime, type, userProperties);
        }
    }
}

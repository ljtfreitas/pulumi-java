// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for a Python environment.
 * 
 */
public final class ModelEnvironmentDefinitionResponseResponsePython extends io.pulumi.resources.InvokeArgs {

    public static final ModelEnvironmentDefinitionResponseResponsePython Empty = new ModelEnvironmentDefinitionResponseResponsePython();

    @InputImport(name="baseCondaEnvironment")
        private final @Nullable String baseCondaEnvironment;

    public Optional<String> getBaseCondaEnvironment() {
        return this.baseCondaEnvironment == null ? Optional.empty() : Optional.ofNullable(this.baseCondaEnvironment);
    }

    /**
     * A JObject containing Conda dependencies.
     * 
     */
    @InputImport(name="condaDependencies")
        private final @Nullable Object condaDependencies;

    public Optional<Object> getCondaDependencies() {
        return this.condaDependencies == null ? Optional.empty() : Optional.ofNullable(this.condaDependencies);
    }

    /**
     * The python interpreter path to use if an environment build is not required. The path specified gets used to call the user script.
     * 
     */
    @InputImport(name="interpreterPath")
        private final @Nullable String interpreterPath;

    public Optional<String> getInterpreterPath() {
        return this.interpreterPath == null ? Optional.empty() : Optional.ofNullable(this.interpreterPath);
    }

    /**
     * True means that AzureML reuses an existing python environment; False means that AzureML will create a python environment based on the Conda dependencies specification.
     * 
     */
    @InputImport(name="userManagedDependencies")
        private final @Nullable Boolean userManagedDependencies;

    public Optional<Boolean> getUserManagedDependencies() {
        return this.userManagedDependencies == null ? Optional.empty() : Optional.ofNullable(this.userManagedDependencies);
    }

    public ModelEnvironmentDefinitionResponseResponsePython(
        @Nullable String baseCondaEnvironment,
        @Nullable Object condaDependencies,
        @Nullable String interpreterPath,
        @Nullable Boolean userManagedDependencies) {
        this.baseCondaEnvironment = baseCondaEnvironment;
        this.condaDependencies = condaDependencies;
        this.interpreterPath = interpreterPath;
        this.userManagedDependencies = userManagedDependencies;
    }

    private ModelEnvironmentDefinitionResponseResponsePython() {
        this.baseCondaEnvironment = null;
        this.condaDependencies = null;
        this.interpreterPath = null;
        this.userManagedDependencies = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionResponseResponsePython defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baseCondaEnvironment;
        private @Nullable Object condaDependencies;
        private @Nullable String interpreterPath;
        private @Nullable Boolean userManagedDependencies;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionResponseResponsePython defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseCondaEnvironment = defaults.baseCondaEnvironment;
    	      this.condaDependencies = defaults.condaDependencies;
    	      this.interpreterPath = defaults.interpreterPath;
    	      this.userManagedDependencies = defaults.userManagedDependencies;
        }

        public Builder setBaseCondaEnvironment(@Nullable String baseCondaEnvironment) {
            this.baseCondaEnvironment = baseCondaEnvironment;
            return this;
        }

        public Builder setCondaDependencies(@Nullable Object condaDependencies) {
            this.condaDependencies = condaDependencies;
            return this;
        }

        public Builder setInterpreterPath(@Nullable String interpreterPath) {
            this.interpreterPath = interpreterPath;
            return this;
        }

        public Builder setUserManagedDependencies(@Nullable Boolean userManagedDependencies) {
            this.userManagedDependencies = userManagedDependencies;
            return this;
        }
        public ModelEnvironmentDefinitionResponseResponsePython build() {
            return new ModelEnvironmentDefinitionResponseResponsePython(baseCondaEnvironment, condaDependencies, interpreterPath, userManagedDependencies);
        }
    }
}

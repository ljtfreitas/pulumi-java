// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModelEnvironmentDefinitionResponseResponsePython {
    private final @Nullable String baseCondaEnvironment;
    /**
     * A JObject containing Conda dependencies.
     * 
     */
    private final @Nullable Object condaDependencies;
    /**
     * The python interpreter path to use if an environment build is not required. The path specified gets used to call the user script.
     * 
     */
    private final @Nullable String interpreterPath;
    /**
     * True means that AzureML reuses an existing python environment; False means that AzureML will create a python environment based on the Conda dependencies specification.
     * 
     */
    private final @Nullable Boolean userManagedDependencies;

    @OutputCustomType.Constructor({"baseCondaEnvironment","condaDependencies","interpreterPath","userManagedDependencies"})
    private ModelEnvironmentDefinitionResponseResponsePython(
        @Nullable String baseCondaEnvironment,
        @Nullable Object condaDependencies,
        @Nullable String interpreterPath,
        @Nullable Boolean userManagedDependencies) {
        this.baseCondaEnvironment = baseCondaEnvironment;
        this.condaDependencies = condaDependencies;
        this.interpreterPath = interpreterPath;
        this.userManagedDependencies = userManagedDependencies;
    }

    public Optional<String> getBaseCondaEnvironment() {
        return Optional.ofNullable(this.baseCondaEnvironment);
    }
    /**
     * A JObject containing Conda dependencies.
     * 
     */
    public Optional<Object> getCondaDependencies() {
        return Optional.ofNullable(this.condaDependencies);
    }
    /**
     * The python interpreter path to use if an environment build is not required. The path specified gets used to call the user script.
     * 
     */
    public Optional<String> getInterpreterPath() {
        return Optional.ofNullable(this.interpreterPath);
    }
    /**
     * True means that AzureML reuses an existing python environment; False means that AzureML will create a python environment based on the Conda dependencies specification.
     * 
     */
    public Optional<Boolean> getUserManagedDependencies() {
        return Optional.ofNullable(this.userManagedDependencies);
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

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The custom setup of installing 3rd party components.
 * 
 */
public final class ComponentSetupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentSetupArgs Empty = new ComponentSetupArgs();

    /**
     * The name of the 3rd party component.
     * 
     */
    @InputImport(name="componentName", required=true)
        private final Input<String> componentName;

    public Input<String> getComponentName() {
        return this.componentName;
    }

    /**
     * The license key to activate the component.
     * 
     */
    @InputImport(name="licenseKey")
        private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> licenseKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getLicenseKey() {
        return this.licenseKey == null ? Input.empty() : this.licenseKey;
    }

    /**
     * The type of custom setup.
     * Expected value is 'ComponentSetup'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ComponentSetupArgs(
        Input<String> componentName,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> licenseKey,
        Input<String> type) {
        this.componentName = Objects.requireNonNull(componentName, "expected parameter 'componentName' to be non-null");
        this.licenseKey = licenseKey;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ComponentSetupArgs() {
        this.componentName = Input.empty();
        this.licenseKey = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> componentName;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> licenseKey;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentSetupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentName = defaults.componentName;
    	      this.licenseKey = defaults.licenseKey;
    	      this.type = defaults.type;
        }

        public Builder setComponentName(Input<String> componentName) {
            this.componentName = Objects.requireNonNull(componentName);
            return this;
        }

        public Builder setComponentName(String componentName) {
            this.componentName = Input.of(Objects.requireNonNull(componentName));
            return this;
        }

        public Builder setLicenseKey(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }

        public Builder setLicenseKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> licenseKey) {
            this.licenseKey = Input.ofNullable(licenseKey);
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
        public ComponentSetupArgs build() {
            return new ComponentSetupArgs(componentName, licenseKey, type);
        }
    }
}

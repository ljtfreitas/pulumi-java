// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.DirectoryServiceOptions;
import io.pulumi.azurenative.storage.inputs.ActiveDirectoryPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for Azure Files identity based authentication.
 * 
 */
public final class AzureFilesIdentityBasedAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFilesIdentityBasedAuthenticationArgs Empty = new AzureFilesIdentityBasedAuthenticationArgs();

    /**
     * Required if choose AD.
     * 
     */
    @InputImport(name="activeDirectoryProperties")
    private final @Nullable Input<ActiveDirectoryPropertiesArgs> activeDirectoryProperties;

    public Input<ActiveDirectoryPropertiesArgs> getActiveDirectoryProperties() {
        return this.activeDirectoryProperties == null ? Input.empty() : this.activeDirectoryProperties;
    }

    /**
     * Indicates the directory service used.
     * 
     */
    @InputImport(name="directoryServiceOptions", required=true)
    private final Input<Either<String,DirectoryServiceOptions>> directoryServiceOptions;

    public Input<Either<String,DirectoryServiceOptions>> getDirectoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    public AzureFilesIdentityBasedAuthenticationArgs(
        @Nullable Input<ActiveDirectoryPropertiesArgs> activeDirectoryProperties,
        Input<Either<String,DirectoryServiceOptions>> directoryServiceOptions) {
        this.activeDirectoryProperties = activeDirectoryProperties;
        this.directoryServiceOptions = Objects.requireNonNull(directoryServiceOptions, "expected parameter 'directoryServiceOptions' to be non-null");
    }

    private AzureFilesIdentityBasedAuthenticationArgs() {
        this.activeDirectoryProperties = Input.empty();
        this.directoryServiceOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFilesIdentityBasedAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ActiveDirectoryPropertiesArgs> activeDirectoryProperties;
        private Input<Either<String,DirectoryServiceOptions>> directoryServiceOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFilesIdentityBasedAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryProperties = defaults.activeDirectoryProperties;
    	      this.directoryServiceOptions = defaults.directoryServiceOptions;
        }

        public Builder setActiveDirectoryProperties(@Nullable Input<ActiveDirectoryPropertiesArgs> activeDirectoryProperties) {
            this.activeDirectoryProperties = activeDirectoryProperties;
            return this;
        }

        public Builder setActiveDirectoryProperties(@Nullable ActiveDirectoryPropertiesArgs activeDirectoryProperties) {
            this.activeDirectoryProperties = Input.ofNullable(activeDirectoryProperties);
            return this;
        }

        public Builder setDirectoryServiceOptions(Input<Either<String,DirectoryServiceOptions>> directoryServiceOptions) {
            this.directoryServiceOptions = Objects.requireNonNull(directoryServiceOptions);
            return this;
        }

        public Builder setDirectoryServiceOptions(Either<String,DirectoryServiceOptions> directoryServiceOptions) {
            this.directoryServiceOptions = Input.of(Objects.requireNonNull(directoryServiceOptions));
            return this;
        }

        public AzureFilesIdentityBasedAuthenticationArgs build() {
            return new AzureFilesIdentityBasedAuthenticationArgs(activeDirectoryProperties, directoryServiceOptions);
        }
    }
}

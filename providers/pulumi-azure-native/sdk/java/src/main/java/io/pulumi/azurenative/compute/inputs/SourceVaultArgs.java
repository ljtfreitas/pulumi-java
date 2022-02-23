// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The vault id is an Azure Resource Manager Resource id in the form /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}
 * 
 */
public final class SourceVaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceVaultArgs Empty = new SourceVaultArgs();

    /**
     * Resource Id
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    public SourceVaultArgs(@Nullable Input<String> id) {
        this.id = id;
    }

    private SourceVaultArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }
        public SourceVaultArgs build() {
            return new SourceVaultArgs(id);
        }
    }
}

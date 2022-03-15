// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a VM from which a formula is to be created.
 * 
 */
public final class FormulaPropertiesFromVmResponse extends io.pulumi.resources.InvokeArgs {

    public static final FormulaPropertiesFromVmResponse Empty = new FormulaPropertiesFromVmResponse();

    /**
     * The identifier of the VM from which a formula is to be created.
     * 
     */
    @Import(name="labVmId")
      private final @Nullable String labVmId;

    public Optional<String> getLabVmId() {
        return this.labVmId == null ? Optional.empty() : Optional.ofNullable(this.labVmId);
    }

    public FormulaPropertiesFromVmResponse(@Nullable String labVmId) {
        this.labVmId = labVmId;
    }

    private FormulaPropertiesFromVmResponse() {
        this.labVmId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FormulaPropertiesFromVmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String labVmId;

        public Builder() {
    	      // Empty
        }

        public Builder(FormulaPropertiesFromVmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labVmId = defaults.labVmId;
        }

        public Builder labVmId(@Nullable String labVmId) {
            this.labVmId = labVmId;
            return this;
        }
        public FormulaPropertiesFromVmResponse build() {
            return new FormulaPropertiesFromVmResponse(labVmId);
        }
    }
}

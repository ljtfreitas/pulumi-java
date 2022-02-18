// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines reference to NSG.
 * 
 */
public final class NsgReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final NsgReferenceResponse Empty = new NsgReferenceResponse();

    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    @InputImport(name="sourceArmResourceId", required=true)
    private final String sourceArmResourceId;

    public String getSourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    public NsgReferenceResponse(String sourceArmResourceId) {
        this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId, "expected parameter 'sourceArmResourceId' to be non-null");
    }

    private NsgReferenceResponse() {
        this.sourceArmResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NsgReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceArmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(NsgReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceArmResourceId = defaults.sourceArmResourceId;
        }

        public Builder setSourceArmResourceId(String sourceArmResourceId) {
            this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
            return this;
        }

        public NsgReferenceResponse build() {
            return new NsgReferenceResponse(sourceArmResourceId);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesGetArgs Empty = new VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesGetArgs();

    /**
     * The criteria for determining a SAN's match.
     * 
     */
    @InputImport(name="match", required=true)
    private final Input<VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

    public Input<VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> getMatch() {
        return this.match;
    }

    public VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesGetArgs(Input<VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
    }

    private VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesGetArgs() {
        this.match = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder setMatch(Input<VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setMatch(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs match) {
            this.match = Input.of(Objects.requireNonNull(match));
            return this;
        }
        public VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesGetArgs build() {
            return new VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesGetArgs(match);
        }
    }
}

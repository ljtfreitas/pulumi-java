// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Structure that contains X.509 EdiPartyName information.
 * 
 */
public final class CertificateEdiPartyNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateEdiPartyNameArgs Empty = new CertificateEdiPartyNameArgs();

    @Import(name="nameAssigner", required=true)
      private final Output<String> nameAssigner;

    public Output<String> getNameAssigner() {
        return this.nameAssigner;
    }

    @Import(name="partyName", required=true)
      private final Output<String> partyName;

    public Output<String> getPartyName() {
        return this.partyName;
    }

    public CertificateEdiPartyNameArgs(
        Output<String> nameAssigner,
        Output<String> partyName) {
        this.nameAssigner = Objects.requireNonNull(nameAssigner, "expected parameter 'nameAssigner' to be non-null");
        this.partyName = Objects.requireNonNull(partyName, "expected parameter 'partyName' to be non-null");
    }

    private CertificateEdiPartyNameArgs() {
        this.nameAssigner = Output.empty();
        this.partyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateEdiPartyNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> nameAssigner;
        private Output<String> partyName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateEdiPartyNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameAssigner = defaults.nameAssigner;
    	      this.partyName = defaults.partyName;
        }

        public Builder nameAssigner(Output<String> nameAssigner) {
            this.nameAssigner = Objects.requireNonNull(nameAssigner);
            return this;
        }

        public Builder nameAssigner(String nameAssigner) {
            this.nameAssigner = Output.of(Objects.requireNonNull(nameAssigner));
            return this;
        }

        public Builder partyName(Output<String> partyName) {
            this.partyName = Objects.requireNonNull(partyName);
            return this;
        }

        public Builder partyName(String partyName) {
            this.partyName = Output.of(Objects.requireNonNull(partyName));
            return this;
        }
        public CertificateEdiPartyNameArgs build() {
            return new CertificateEdiPartyNameArgs(nameAssigner, partyName);
        }
    }
}

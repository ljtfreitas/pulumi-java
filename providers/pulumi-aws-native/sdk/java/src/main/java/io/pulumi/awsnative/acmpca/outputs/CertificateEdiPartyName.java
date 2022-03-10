// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CertificateEdiPartyName {
    private final String nameAssigner;
    private final String partyName;

    @OutputCustomType.Constructor
    private CertificateEdiPartyName(
        @OutputCustomType.Parameter("nameAssigner") String nameAssigner,
        @OutputCustomType.Parameter("partyName") String partyName) {
        this.nameAssigner = nameAssigner;
        this.partyName = partyName;
    }

    public String getNameAssigner() {
        return this.nameAssigner;
    }
    public String getPartyName() {
        return this.partyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateEdiPartyName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nameAssigner;
        private String partyName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateEdiPartyName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameAssigner = defaults.nameAssigner;
    	      this.partyName = defaults.partyName;
        }

        public Builder setNameAssigner(String nameAssigner) {
            this.nameAssigner = Objects.requireNonNull(nameAssigner);
            return this;
        }

        public Builder setPartyName(String partyName) {
            this.partyName = Objects.requireNonNull(partyName);
            return this;
        }
        public CertificateEdiPartyName build() {
            return new CertificateEdiPartyName(nameAssigner, partyName);
        }
    }
}

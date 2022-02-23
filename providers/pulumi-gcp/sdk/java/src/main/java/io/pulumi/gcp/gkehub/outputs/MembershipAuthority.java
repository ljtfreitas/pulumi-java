// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MembershipAuthority {
    private final String issuer;

    @OutputCustomType.Constructor({"issuer"})
    private MembershipAuthority(String issuer) {
        this.issuer = Objects.requireNonNull(issuer);
    }

    public String getIssuer() {
        return this.issuer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipAuthority defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipAuthority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public MembershipAuthority build() {
            return new MembershipAuthority(issuer);
        }
    }
}

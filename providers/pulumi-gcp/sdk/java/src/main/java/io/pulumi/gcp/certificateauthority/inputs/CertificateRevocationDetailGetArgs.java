// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateRevocationDetailGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateRevocationDetailGetArgs Empty = new CertificateRevocationDetailGetArgs();

    @Import(name="revocationState")
      private final @Nullable Output<String> revocationState;

    public Output<String> revocationState() {
        return this.revocationState == null ? Codegen.empty() : this.revocationState;
    }

    @Import(name="revocationTime")
      private final @Nullable Output<String> revocationTime;

    public Output<String> revocationTime() {
        return this.revocationTime == null ? Codegen.empty() : this.revocationTime;
    }

    public CertificateRevocationDetailGetArgs(
        @Nullable Output<String> revocationState,
        @Nullable Output<String> revocationTime) {
        this.revocationState = revocationState;
        this.revocationTime = revocationTime;
    }

    private CertificateRevocationDetailGetArgs() {
        this.revocationState = Codegen.empty();
        this.revocationTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateRevocationDetailGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> revocationState;
        private @Nullable Output<String> revocationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateRevocationDetailGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revocationState = defaults.revocationState;
    	      this.revocationTime = defaults.revocationTime;
        }

        public Builder revocationState(@Nullable Output<String> revocationState) {
            this.revocationState = revocationState;
            return this;
        }
        public Builder revocationState(@Nullable String revocationState) {
            this.revocationState = Codegen.ofNullable(revocationState);
            return this;
        }
        public Builder revocationTime(@Nullable Output<String> revocationTime) {
            this.revocationTime = revocationTime;
            return this;
        }
        public Builder revocationTime(@Nullable String revocationTime) {
            this.revocationTime = Codegen.ofNullable(revocationTime);
            return this;
        }        public CertificateRevocationDetailGetArgs build() {
            return new CertificateRevocationDetailGetArgs(revocationState, revocationTime);
        }
    }
}

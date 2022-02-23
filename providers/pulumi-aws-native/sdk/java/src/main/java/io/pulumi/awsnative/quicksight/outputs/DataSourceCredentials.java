// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.DataSourceCredentialPair;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceCredentials {
    /**
     * <p>The Amazon Resource Name (ARN) of a data source that has the credential pair that you
     *             want to use. When <code>CopySourceArn</code> is not null, the credential pair from the
     *             data source in the ARN is used as the credentials for the
     *             <code>DataSourceCredentials</code> structure.</p>
     * 
     */
    private final @Nullable String copySourceArn;
    private final @Nullable DataSourceCredentialPair credentialPair;

    @OutputCustomType.Constructor({"copySourceArn","credentialPair"})
    private DataSourceCredentials(
        @Nullable String copySourceArn,
        @Nullable DataSourceCredentialPair credentialPair) {
        this.copySourceArn = copySourceArn;
        this.credentialPair = credentialPair;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of a data source that has the credential pair that you
     *             want to use. When <code>CopySourceArn</code> is not null, the credential pair from the
     *             data source in the ARN is used as the credentials for the
     *             <code>DataSourceCredentials</code> structure.</p>
     * 
     */
    public Optional<String> getCopySourceArn() {
        return Optional.ofNullable(this.copySourceArn);
    }
    public Optional<DataSourceCredentialPair> getCredentialPair() {
        return Optional.ofNullable(this.credentialPair);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String copySourceArn;
        private @Nullable DataSourceCredentialPair credentialPair;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copySourceArn = defaults.copySourceArn;
    	      this.credentialPair = defaults.credentialPair;
        }

        public Builder setCopySourceArn(@Nullable String copySourceArn) {
            this.copySourceArn = copySourceArn;
            return this;
        }

        public Builder setCredentialPair(@Nullable DataSourceCredentialPair credentialPair) {
            this.credentialPair = credentialPair;
            return this;
        }
        public DataSourceCredentials build() {
            return new DataSourceCredentials(copySourceArn, credentialPair);
        }
    }
}

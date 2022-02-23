// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.outputs;

import io.pulumi.aws.kms.outputs.GetSecretsSecret;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetSecretsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Map containing each `secret` `name` as the key with its decrypted plaintext value
     * 
     */
    private final Map<String,String> plaintext;
    private final List<GetSecretsSecret> secrets;

    @OutputCustomType.Constructor({"id","plaintext","secrets"})
    private GetSecretsResult(
        String id,
        Map<String,String> plaintext,
        List<GetSecretsSecret> secrets) {
        this.id = Objects.requireNonNull(id);
        this.plaintext = Objects.requireNonNull(plaintext);
        this.secrets = Objects.requireNonNull(secrets);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Map containing each `secret` `name` as the key with its decrypted plaintext value
     * 
     */
    public Map<String,String> getPlaintext() {
        return this.plaintext;
    }
    public List<GetSecretsSecret> getSecrets() {
        return this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Map<String,String> plaintext;
        private List<GetSecretsSecret> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.plaintext = defaults.plaintext;
    	      this.secrets = defaults.secrets;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPlaintext(Map<String,String> plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }

        public Builder setSecrets(List<GetSecretsSecret> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public GetSecretsResult build() {
            return new GetSecretsResult(id, plaintext, secrets);
        }
    }
}

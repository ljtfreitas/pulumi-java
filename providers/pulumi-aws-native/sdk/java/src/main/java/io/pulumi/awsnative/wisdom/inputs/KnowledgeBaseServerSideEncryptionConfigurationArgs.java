// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KnowledgeBaseServerSideEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final KnowledgeBaseServerSideEncryptionConfigurationArgs Empty = new KnowledgeBaseServerSideEncryptionConfigurationArgs();

    @InputImport(name="kmsKeyId")
        private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    public KnowledgeBaseServerSideEncryptionConfigurationArgs(@Nullable Input<String> kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    private KnowledgeBaseServerSideEncryptionConfigurationArgs() {
        this.kmsKeyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseServerSideEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseServerSideEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }
        public KnowledgeBaseServerSideEncryptionConfigurationArgs build() {
            return new KnowledgeBaseServerSideEncryptionConfigurationArgs(kmsKeyId);
        }
    }
}

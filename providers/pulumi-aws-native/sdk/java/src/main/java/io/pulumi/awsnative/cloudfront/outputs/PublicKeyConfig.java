// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PublicKeyConfig {
    private final String callerReference;
    private final @Nullable String comment;
    private final String encodedKey;
    private final String name;

    @OutputCustomType.Constructor({"callerReference","comment","encodedKey","name"})
    private PublicKeyConfig(
        String callerReference,
        @Nullable String comment,
        String encodedKey,
        String name) {
        this.callerReference = Objects.requireNonNull(callerReference);
        this.comment = comment;
        this.encodedKey = Objects.requireNonNull(encodedKey);
        this.name = Objects.requireNonNull(name);
    }

    public String getCallerReference() {
        return this.callerReference;
    }
    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    public String getEncodedKey() {
        return this.encodedKey;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callerReference;
        private @Nullable String comment;
        private String encodedKey;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callerReference = defaults.callerReference;
    	      this.comment = defaults.comment;
    	      this.encodedKey = defaults.encodedKey;
    	      this.name = defaults.name;
        }

        public Builder setCallerReference(String callerReference) {
            this.callerReference = Objects.requireNonNull(callerReference);
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setEncodedKey(String encodedKey) {
            this.encodedKey = Objects.requireNonNull(encodedKey);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PublicKeyConfig build() {
            return new PublicKeyConfig(callerReference, comment, encodedKey, name);
        }
    }
}

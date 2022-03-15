// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxEntityTypeEntity {
    /**
     * A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym could be green onions.
     * For KIND_LIST entity types: This collection must contain exactly one synonym equal to value.
     * 
     */
    private final @Nullable List<String> synonyms;
    /**
     * The word or phrase to be excluded.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private CxEntityTypeEntity(
        @CustomType.Parameter("synonyms") @Nullable List<String> synonyms,
        @CustomType.Parameter("value") @Nullable String value) {
        this.synonyms = synonyms;
        this.value = value;
    }

    /**
     * A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym could be green onions.
     * For KIND_LIST entity types: This collection must contain exactly one synonym equal to value.
     * 
    */
    public List<String> getSynonyms() {
        return this.synonyms == null ? List.of() : this.synonyms;
    }
    /**
     * The word or phrase to be excluded.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEntityTypeEntity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> synonyms;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEntityTypeEntity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder synonyms(@Nullable List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public CxEntityTypeEntity build() {
            return new CxEntityTypeEntity(synonyms, value);
        }
    }
}

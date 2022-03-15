// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1.enums.AliasContextKind;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An alias to a repo revision.
 * 
 */
public final class AliasContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasContextArgs Empty = new AliasContextArgs();

    /**
     * The alias kind.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<AliasContextKind> kind;

    public Output<AliasContextKind> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The alias name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public AliasContextArgs(
        @Nullable Output<AliasContextKind> kind,
        @Nullable Output<String> name) {
        this.kind = kind;
        this.name = name;
    }

    private AliasContextArgs() {
        this.kind = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AliasContextKind> kind;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder kind(@Nullable Output<AliasContextKind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable AliasContextKind kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public AliasContextArgs build() {
            return new AliasContextArgs(kind, name);
        }
    }
}

// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FooArgs extends io.pulumi.resources.ResourceArgs {

    public static final FooArgs Empty = new FooArgs();

    @Import(name="a", required=true)
      private final Boolean a;

    public Boolean getA() {
        return this.a;
    }

    @Import(name="b")
      private final @Nullable Boolean b;

    public Optional<Boolean> getB() {
        return this.b == null ? Optional.empty() : Optional.ofNullable(this.b);
    }

    @Import(name="c", required=true)
      private final Integer c;

    public Integer getC() {
        return this.c;
    }

    @Import(name="d")
      private final @Nullable Integer d;

    public Optional<Integer> getD() {
        return this.d == null ? Optional.empty() : Optional.ofNullable(this.d);
    }

    @Import(name="e", required=true)
      private final String e;

    public String getE() {
        return this.e;
    }

    @Import(name="f")
      private final @Nullable String f;

    public Optional<String> getF() {
        return this.f == null ? Optional.empty() : Optional.ofNullable(this.f);
    }

    public FooArgs(
        Boolean a,
        @Nullable Boolean b,
        Integer c,
        @Nullable Integer d,
        String e,
        @Nullable String f) {
        this.a = Objects.requireNonNull(a, "expected parameter 'a' to be non-null");
        this.b = b;
        this.c = Objects.requireNonNull(c, "expected parameter 'c' to be non-null");
        this.d = d;
        this.e = Objects.requireNonNull(e, "expected parameter 'e' to be non-null");
        this.f = f;
    }

    private FooArgs() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FooArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean a;
        private @Nullable Boolean b;
        private Integer c;
        private @Nullable Integer d;
        private String e;
        private @Nullable String f;

        public Builder() {
    	      // Empty
        }

        public Builder(FooArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.a = defaults.a;
    	      this.b = defaults.b;
    	      this.c = defaults.c;
    	      this.d = defaults.d;
    	      this.e = defaults.e;
    	      this.f = defaults.f;
        }

        public Builder a(Boolean a) {
            this.a = Objects.requireNonNull(a);
            return this;
        }

        public Builder b(@Nullable Boolean b) {
            this.b = b;
            return this;
        }

        public Builder c(Integer c) {
            this.c = Objects.requireNonNull(c);
            return this;
        }

        public Builder d(@Nullable Integer d) {
            this.d = d;
            return this;
        }

        public Builder e(String e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }

        public Builder f(@Nullable String f) {
            this.f = f;
            return this;
        }
        public FooArgs build() {
            return new FooArgs(a, b, c, d, e, f);
        }
    }
}

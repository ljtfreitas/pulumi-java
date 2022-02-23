// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Foo {
    private final Boolean a;
    private final @Nullable Boolean b;
    private final Integer c;
    private final @Nullable Integer d;
    private final String e;
    private final @Nullable String f;

    @OutputCustomType.Constructor({"a","b","c","d","e","f"})
    private Foo(
        Boolean a,
        @Nullable Boolean b,
        Integer c,
        @Nullable Integer d,
        String e,
        @Nullable String f) {
        this.a = Objects.requireNonNull(a);
        this.b = b;
        this.c = Objects.requireNonNull(c);
        this.d = d;
        this.e = Objects.requireNonNull(e);
        this.f = f;
    }

    public Boolean getA() {
        return this.a;
    }
    public Optional<Boolean> getB() {
        return Optional.ofNullable(this.b);
    }
    public Integer getC() {
        return this.c;
    }
    public Optional<Integer> getD() {
        return Optional.ofNullable(this.d);
    }
    public String getE() {
        return this.e;
    }
    public Optional<String> getF() {
        return Optional.ofNullable(this.f);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Foo defaults) {
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

        public Builder(Foo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.a = defaults.a;
    	      this.b = defaults.b;
    	      this.c = defaults.c;
    	      this.d = defaults.d;
    	      this.e = defaults.e;
    	      this.f = defaults.f;
        }

        public Builder setA(Boolean a) {
            this.a = Objects.requireNonNull(a);
            return this;
        }

        public Builder setB(@Nullable Boolean b) {
            this.b = b;
            return this;
        }

        public Builder setC(Integer c) {
            this.c = Objects.requireNonNull(c);
            return this;
        }

        public Builder setD(@Nullable Integer d) {
            this.d = d;
            return this;
        }

        public Builder setE(String e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }

        public Builder setF(@Nullable String f) {
            this.f = f;
            return this;
        }
        public Foo build() {
            return new Foo(a, b, c, d, e, f);
        }
    }
}

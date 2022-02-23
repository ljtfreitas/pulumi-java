// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Current State of the Instance.
 * 
 */
public final class InstanceStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceStateArgs Empty = new InstanceStateArgs();

    /**
     * Status code of the Instance.
     * 
     */
    @InputImport(name="code")
        private final @Nullable Input<Integer> code;

    public Input<Integer> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * Status code of the Instance.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public InstanceStateArgs(
        @Nullable Input<Integer> code,
        @Nullable Input<String> name) {
        this.code = code;
        this.name = name;
    }

    private InstanceStateArgs() {
        this.code = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> code;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.name = defaults.name;
        }

        public Builder setCode(@Nullable Input<Integer> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable Integer code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public InstanceStateArgs build() {
            return new InstanceStateArgs(code, name);
        }
    }
}

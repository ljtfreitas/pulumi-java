// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.example.Resource;
import io.pulumi.example.inputs.ConfigMapArgs;
import io.pulumi.example.inputs.SomeOtherObjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectArgs Empty = new ObjectArgs();

    @InputImport(name="bar")
      private final @Nullable Input<String> bar;

    public Input<String> getBar() {
        return this.bar == null ? Input.empty() : this.bar;
    }

    @InputImport(name="configs")
      private final @Nullable Input<List<ConfigMapArgs>> configs;

    public Input<List<ConfigMapArgs>> getConfigs() {
        return this.configs == null ? Input.empty() : this.configs;
    }

    @InputImport(name="foo")
      private final @Nullable Input<Resource> foo;

    public Input<Resource> getFoo() {
        return this.foo == null ? Input.empty() : this.foo;
    }

    /**
     * List of lists of other objects
     * 
     */
    @InputImport(name="others")
      private final @Nullable Input<List<List<SomeOtherObjectArgs>>> others;

    public Input<List<List<SomeOtherObjectArgs>>> getOthers() {
        return this.others == null ? Input.empty() : this.others;
    }

    /**
     * Mapping from string to list of some other object
     * 
     */
    @InputImport(name="stillOthers")
      private final @Nullable Input<Map<String,List<SomeOtherObjectArgs>>> stillOthers;

    public Input<Map<String,List<SomeOtherObjectArgs>>> getStillOthers() {
        return this.stillOthers == null ? Input.empty() : this.stillOthers;
    }

    public ObjectArgs(
        @Nullable Input<String> bar,
        @Nullable Input<List<ConfigMapArgs>> configs,
        @Nullable Input<Resource> foo,
        @Nullable Input<List<List<SomeOtherObjectArgs>>> others,
        @Nullable Input<Map<String,List<SomeOtherObjectArgs>>> stillOthers) {
        this.bar = bar;
        this.configs = configs;
        this.foo = foo;
        this.others = others;
        this.stillOthers = stillOthers;
    }

    private ObjectArgs() {
        this.bar = Input.empty();
        this.configs = Input.empty();
        this.foo = Input.empty();
        this.others = Input.empty();
        this.stillOthers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bar;
        private @Nullable Input<List<ConfigMapArgs>> configs;
        private @Nullable Input<Resource> foo;
        private @Nullable Input<List<List<SomeOtherObjectArgs>>> others;
        private @Nullable Input<Map<String,List<SomeOtherObjectArgs>>> stillOthers;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bar = defaults.bar;
    	      this.configs = defaults.configs;
    	      this.foo = defaults.foo;
    	      this.others = defaults.others;
    	      this.stillOthers = defaults.stillOthers;
        }

        public Builder setBar(@Nullable Input<String> bar) {
            this.bar = bar;
            return this;
        }

        public Builder setBar(@Nullable String bar) {
            this.bar = Input.ofNullable(bar);
            return this;
        }

        public Builder setConfigs(@Nullable Input<List<ConfigMapArgs>> configs) {
            this.configs = configs;
            return this;
        }

        public Builder setConfigs(@Nullable List<ConfigMapArgs> configs) {
            this.configs = Input.ofNullable(configs);
            return this;
        }

        public Builder setFoo(@Nullable Input<Resource> foo) {
            this.foo = foo;
            return this;
        }

        public Builder setFoo(@Nullable Resource foo) {
            this.foo = Input.ofNullable(foo);
            return this;
        }

        public Builder setOthers(@Nullable Input<List<List<SomeOtherObjectArgs>>> others) {
            this.others = others;
            return this;
        }

        public Builder setOthers(@Nullable List<List<SomeOtherObjectArgs>> others) {
            this.others = Input.ofNullable(others);
            return this;
        }

        public Builder setStillOthers(@Nullable Input<Map<String,List<SomeOtherObjectArgs>>> stillOthers) {
            this.stillOthers = stillOthers;
            return this;
        }

        public Builder setStillOthers(@Nullable Map<String,List<SomeOtherObjectArgs>> stillOthers) {
            this.stillOthers = Input.ofNullable(stillOthers);
            return this;
        }
        public ObjectArgs build() {
            return new ObjectArgs(bar, configs, foo, others, stillOthers);
        }
    }
}

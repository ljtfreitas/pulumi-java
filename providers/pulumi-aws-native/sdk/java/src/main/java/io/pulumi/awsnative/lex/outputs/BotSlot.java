// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotMultipleValuesSetting;
import io.pulumi.awsnative.lex.outputs.BotObfuscationSetting;
import io.pulumi.awsnative.lex.outputs.BotSlotValueElicitationSetting;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotSlot {
    private final @Nullable String description;
    private final @Nullable BotMultipleValuesSetting multipleValuesSetting;
    private final String name;
    private final @Nullable BotObfuscationSetting obfuscationSetting;
    private final String slotTypeName;
    private final BotSlotValueElicitationSetting valueElicitationSetting;

    @CustomType.Constructor
    private BotSlot(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("multipleValuesSetting") @Nullable BotMultipleValuesSetting multipleValuesSetting,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("obfuscationSetting") @Nullable BotObfuscationSetting obfuscationSetting,
        @CustomType.Parameter("slotTypeName") String slotTypeName,
        @CustomType.Parameter("valueElicitationSetting") BotSlotValueElicitationSetting valueElicitationSetting) {
        this.description = description;
        this.multipleValuesSetting = multipleValuesSetting;
        this.name = name;
        this.obfuscationSetting = obfuscationSetting;
        this.slotTypeName = slotTypeName;
        this.valueElicitationSetting = valueElicitationSetting;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<BotMultipleValuesSetting> getMultipleValuesSetting() {
        return Optional.ofNullable(this.multipleValuesSetting);
    }
    public String getName() {
        return this.name;
    }
    public Optional<BotObfuscationSetting> getObfuscationSetting() {
        return Optional.ofNullable(this.obfuscationSetting);
    }
    public String getSlotTypeName() {
        return this.slotTypeName;
    }
    public BotSlotValueElicitationSetting getValueElicitationSetting() {
        return this.valueElicitationSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable BotMultipleValuesSetting multipleValuesSetting;
        private String name;
        private @Nullable BotObfuscationSetting obfuscationSetting;
        private String slotTypeName;
        private BotSlotValueElicitationSetting valueElicitationSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.multipleValuesSetting = defaults.multipleValuesSetting;
    	      this.name = defaults.name;
    	      this.obfuscationSetting = defaults.obfuscationSetting;
    	      this.slotTypeName = defaults.slotTypeName;
    	      this.valueElicitationSetting = defaults.valueElicitationSetting;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder multipleValuesSetting(@Nullable BotMultipleValuesSetting multipleValuesSetting) {
            this.multipleValuesSetting = multipleValuesSetting;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder obfuscationSetting(@Nullable BotObfuscationSetting obfuscationSetting) {
            this.obfuscationSetting = obfuscationSetting;
            return this;
        }

        public Builder slotTypeName(String slotTypeName) {
            this.slotTypeName = Objects.requireNonNull(slotTypeName);
            return this;
        }

        public Builder valueElicitationSetting(BotSlotValueElicitationSetting valueElicitationSetting) {
            this.valueElicitationSetting = Objects.requireNonNull(valueElicitationSetting);
            return this;
        }
        public BotSlot build() {
            return new BotSlot(description, multipleValuesSetting, name, obfuscationSetting, slotTypeName, valueElicitationSetting);
        }
    }
}

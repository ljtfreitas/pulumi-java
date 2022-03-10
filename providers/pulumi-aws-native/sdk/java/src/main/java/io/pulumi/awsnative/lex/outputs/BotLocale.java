// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotIntent;
import io.pulumi.awsnative.lex.outputs.BotSlotType;
import io.pulumi.awsnative.lex.outputs.BotVoiceSettings;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotLocale {
    private final @Nullable String description;
    /**
     * List of intents
     * 
     */
    private final @Nullable List<BotIntent> intents;
    private final String localeId;
    private final Double nluConfidenceThreshold;
    /**
     * List of SlotTypes
     * 
     */
    private final @Nullable List<BotSlotType> slotTypes;
    private final @Nullable BotVoiceSettings voiceSettings;

    @OutputCustomType.Constructor
    private BotLocale(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("intents") @Nullable List<BotIntent> intents,
        @OutputCustomType.Parameter("localeId") String localeId,
        @OutputCustomType.Parameter("nluConfidenceThreshold") Double nluConfidenceThreshold,
        @OutputCustomType.Parameter("slotTypes") @Nullable List<BotSlotType> slotTypes,
        @OutputCustomType.Parameter("voiceSettings") @Nullable BotVoiceSettings voiceSettings) {
        this.description = description;
        this.intents = intents;
        this.localeId = localeId;
        this.nluConfidenceThreshold = nluConfidenceThreshold;
        this.slotTypes = slotTypes;
        this.voiceSettings = voiceSettings;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * List of intents
     * 
    */
    public List<BotIntent> getIntents() {
        return this.intents == null ? List.of() : this.intents;
    }
    public String getLocaleId() {
        return this.localeId;
    }
    public Double getNluConfidenceThreshold() {
        return this.nluConfidenceThreshold;
    }
    /**
     * List of SlotTypes
     * 
    */
    public List<BotSlotType> getSlotTypes() {
        return this.slotTypes == null ? List.of() : this.slotTypes;
    }
    public Optional<BotVoiceSettings> getVoiceSettings() {
        return Optional.ofNullable(this.voiceSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotLocale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<BotIntent> intents;
        private String localeId;
        private Double nluConfidenceThreshold;
        private @Nullable List<BotSlotType> slotTypes;
        private @Nullable BotVoiceSettings voiceSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BotLocale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.intents = defaults.intents;
    	      this.localeId = defaults.localeId;
    	      this.nluConfidenceThreshold = defaults.nluConfidenceThreshold;
    	      this.slotTypes = defaults.slotTypes;
    	      this.voiceSettings = defaults.voiceSettings;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIntents(@Nullable List<BotIntent> intents) {
            this.intents = intents;
            return this;
        }

        public Builder setLocaleId(String localeId) {
            this.localeId = Objects.requireNonNull(localeId);
            return this;
        }

        public Builder setNluConfidenceThreshold(Double nluConfidenceThreshold) {
            this.nluConfidenceThreshold = Objects.requireNonNull(nluConfidenceThreshold);
            return this;
        }

        public Builder setSlotTypes(@Nullable List<BotSlotType> slotTypes) {
            this.slotTypes = slotTypes;
            return this;
        }

        public Builder setVoiceSettings(@Nullable BotVoiceSettings voiceSettings) {
            this.voiceSettings = voiceSettings;
            return this;
        }
        public BotLocale build() {
            return new BotLocale(description, intents, localeId, nluConfidenceThreshold, slotTypes, voiceSettings);
        }
    }
}
